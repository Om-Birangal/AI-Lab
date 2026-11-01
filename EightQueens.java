public class EightQueens {
    static int[] board = new int[8];
    static boolean isSafe(int row,int col){
        for(int i=0;i<row;i++){
            if(board[i]==col){
                return false;
            }
            if(Math.abs(board[i]-col) == Math.abs(i-row)){
                return false;
            }
        }
        return true;
    }
    static boolean solve(int row){
        if(row==8){
            return true;
        }
        for(int col = 0; col<8;col++){
            if(isSafe(row,col)){
                board[row]=col;
                if(solve(row + 1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        if(solve(0)){
            System.out.println("Solution : ");
        for(int row=0;row<8;row++){
            for(int col=0;col<8;col++){
                    if(board[row]==col){
                        System.out.print(" Q ");
                    }
                    else{
                        System.out.print(" _ ");
                    }
                }
                System.out.println();
            }
        }
        else{
            System.out.println("No Solution");
        }
    }
}
