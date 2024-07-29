/*
1395. Count Number of Teams
Medium
Topics
Companies
Hint
There are n soldiers standing in a line. Each soldier is assigned a unique rating value.

You have to form a team of 3 soldiers amongst them under the following rules:

Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
A team is valid if: (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).



Example 1:

Input: rating = [2,5,3,4,1]
Output: 3
Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1).
Example 2:

Input: rating = [2,1,3]
Output: 0
Explanation: We can't form any team given the conditions.
Example 3:

Input: rating = [1,2,3,4]
Output: 4
 */
public class CountNumberofTeams {

    public int numTeams(int[] rating) {
        int ans = 0;

        for (int i = 1; i < rating.length - 1; ++i) {
            int leftLess = 0;   //1
            int leftGreater = 0; //1
            for (int j = 0; j < i; ++j)
                if (rating[j] < rating[i])
                    ++leftLess;
                else if (rating[j] > rating[i])
                    ++leftGreater;
            int rightLess = 0;
            int rightGreater = 0;
            for (int j = i + 1; j < rating.length; ++j)
                if (rating[j] < rating[i])
                    ++rightLess;
                else if (rating[j] > rating[i])
                    ++rightGreater;
            ans += leftLess * rightGreater + leftGreater * rightLess;
        }
        return ans;
    }
    public static void main(String[] args) {
        CountNumberofTeams cnt = new CountNumberofTeams();
        int[] arr = {2,5,3,4,1};
        int[] arr1 = {2,1,3};
        int[] arr2 = {1,2,3,4};
        System.out.println(cnt.numTeams(arr));
        System.out.println(cnt.numTeams(arr1));
        System.out.println(cnt.numTeams(arr2));
    }
}
