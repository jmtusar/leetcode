class Solution {
    public boolean isPalindrome(int x) {
        int reversed=0;
        int a=x;
        int n=0;
        while(a>0){
            n=a%10;
            reversed=(reversed*10)+n;
            a=a/10;
        }
        if(reversed==x) return true;
            
        return false;
    }
}
