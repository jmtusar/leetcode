class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }
    public int findSquare(int n){
        int sum = 0;
        while(n > 0){
            // sum += Math.pow((n%10), 2);
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
}
