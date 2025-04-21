class Solution {
    public int findPeakElement(int[] arr) {
        int low = 0, high = arr.length-1;

        if(arr.length == 1) 
            return 0;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]<arr[mid+1])
                low = mid+1;
            else
                high = mid;
        }
        return low;
    }
}
