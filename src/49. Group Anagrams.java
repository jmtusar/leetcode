class Solution {
    public List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
        
        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            
            if (!anagramGroups.containsKey(key)) {
                anagramGroups.put(key, new ArrayList<>(List.of(word)));
            }
            else {
                anagramGroups.get(key).add(word);
            }
        }
        
        return new ArrayList<>(anagramGroups.values());
    }
}
