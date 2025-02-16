class RandomizedSet {

  List<Integer> list;
  Map<Integer, Integer> map;
  Random random;

  public RandomizedSet() {
    list = new ArrayList<>();
    map = new HashMap<>();
    random = new Random();
  }

  public boolean insert(int val) {
    if (map.containsKey(val)) {
      return false;
    }
    map.put(val, list.size());
    list.add(val);
    return true;
  }

  public boolean remove(int val) {
    if (!map.containsKey(val)) {
      return false;
    }
    int index = map.get(val);
    if (index < list.size() - 1) {
      int last = list.get(list.size() - 1);
      map.put(last, index);
      list.set(index, last);
    }
    map.remove(val);
    list.remove(list.size() - 1);
    return true;
  }

  public int getRandom() {
    int index = random.nextInt(list.size());
    return list.get(index);
  }
}
