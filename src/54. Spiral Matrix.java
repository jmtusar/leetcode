class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rowTop = 0;
        int rowBot = matrix.length - 1;
        int columnLeft = 0;
        int columnRight = matrix[0].length - 1;

        while (rowTop <= rowBot && columnLeft <= columnRight) {
            for (int i = columnLeft; i <= columnRight; i++) {
                res.add(matrix[rowTop][i]);
            }
            rowTop++;

            for (int i = rowTop; i <= rowBot; i++) {
                res.add(matrix[i][columnRight]);
            }
            columnRight--;

            if (rowTop <= rowBot) {
                for (int i = columnRight; i >= columnLeft; i--) {
                    res.add(matrix[rowBot][i]);
                }
                rowBot--;
            }

            if (columnLeft <= columnRight) {
                for (int i = rowBot; i >= rowTop; i--) {
                    res.add(matrix[i][columnLeft]);
                }
                columnLeft++;
            }
        }
        return res;
    }
}
