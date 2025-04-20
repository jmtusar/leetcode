class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        if(matrix.length == 1 && matrix[0][0] == target)
            return true;
        while(i < matrix.length && j >= 0) {
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target)
                j--;
            else if(matrix[i][j] < target)
                i++;
        }
        return false;
    }
}
