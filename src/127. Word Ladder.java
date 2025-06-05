class Pair{
    String first;
    int second;
    Pair(String f,int s){
        first = f;
        second = s;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if(!wordSet.contains(endWord))
            return 0;

        Queue<Pair> q = new LinkedList();
        q.add(new Pair (beginWord,1));

        while(!q.isEmpty()){
            String word = q.peek().first;
            int length = q.peek().second;
            q.poll();
            if(word.equals(endWord)){
                return length;
            }
            char[] replacedArray = word.toCharArray();
            for(int i = 0;i<replacedArray.length;i++){
                char OriginalChar = replacedArray[i];
                for(char ch = 'a';ch<='z';ch++){
                    replacedArray[i] = ch;
                    String replacedString = new String(replacedArray);
                    if(wordSet.contains(replacedString)){
                        wordSet.remove(replacedString);
                        q.add(new Pair(replacedString,length+1));
                    }
                }
                replacedArray[i] = OriginalChar;

            }
        }
        return 0;
    }
}
