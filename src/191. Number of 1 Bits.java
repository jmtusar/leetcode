class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            int dg = n%2;
            n /= 2;
            if(dg == 1)
              count++;
        }
        return count;
    }
}
