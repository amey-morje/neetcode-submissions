class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(!isValid(i,j,board)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int i, int j, char[][] board){
        if(board[i][j] == '.') return true;

        for(int m=0; m < 9; m++){
            if(m==i) continue;
            if(board[m][j] == board[i][j]) return false;
        }

        for(int m=0; m < 9; m++){
            if(m==j) continue;
            if(board[i][m] == board[i][j]) return false;
        }

        int r = (i/3) * 3;
        int c = (j/3) * 3;

        for(int m=0; m<9; m++){
            int y=r+ (m/3);
            int z=c+ (m%3);
            if(y == i && z == j) continue;
            if(board[y][z] == board[i][j]) return false;
        }
        return true;
    }
}
