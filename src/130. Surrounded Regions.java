class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int r = 0 ; r<n ; r++){
            if(board[r][0]=='O') cross_connection(board, r , 0, n, m);
            if(board[r][m-1]=='O') cross_connection(board, r, m-1, n, m);
        }

        for(int c =0 ; c<m ; c++){
            if(board[0][c]=='O') cross_connection(board, 0 , c, n , m);
            if(board[n-1][c]=='O') cross_connection(board, n-1, c , n , m);
        }

        for(int i = 0;i<n; i++){
            for(int j =0; j<m ; j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='T') board[i][j]='O';
            }
        }
    }
    public void cross_connection(char[][]board, int i , int j, int n , int m){
        if(i<0 || i>=n || j<0 || j>=m || board[i][j]!='O') return;

        board[i][j] = 'T';
        cross_connection(board, i-1, j, n , m);
        cross_connection(board, i+1, j, n , m);
        cross_connection(board, i, j-1, n , m);
        cross_connection(board, i, j+1, n , m);
    }
}
