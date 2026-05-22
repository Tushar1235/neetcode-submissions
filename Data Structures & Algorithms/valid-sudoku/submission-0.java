class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int r=0;r<9;r++) {
            Set<Character> seen = new HashSet<>();
            for(int c=0;c < 9;c++) {
                if(board[r][c] == '.') continue;

                if(seen.contains(board[r][c])) return false;

                seen.add(board[r][c]);
            }
        }
        for(int c=0;c<9;c++) {
            Set<Character> seen = new HashSet<>();
            for(int r=0;r < 9;r++) {
                if(board[r][c] == '.') continue;

                if(seen.contains(board[r][c])) return false;

                seen.add(board[r][c]);
            }
        }

        for(int s=0;s<9;s++){
             Set<Character> seen = new HashSet<>();
            for(int i=0;i<3;i++) {
           
            for(int j=0;j<3;j++) {
                int r = (s/3) * 3 + i;
                int c = (s%3) * 3 + j;

                if(board[r][c] == '.') continue;

                if(seen.contains(board[r][c])) return false;

                seen.add(board[r][c]);
            }
        }

       
        }
        return true;
        
    }
}
