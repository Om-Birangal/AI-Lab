public class SudokuSolver{
    static int[][] sudoku ={
        {5,3,0,0,0,0,0,6,0},
        {0,0,0,0,0,0,0,1,0},
        {0,0,0,0,0,0,8,0,0},
        {0,0,0,0,0,0,2,0,0},
        {0,0,0,0,0,7,0,0,0},
        {0,0,0,0,0,0,1,0,0},
        {0,0,0,0,0,8,0,0,0},
        {0,0,0,0,0,0,4,0,0},
        {0,0,0,0,0,0,0,9,0}
    };
    static boolean isSafe(int row,int col,int num){
        for(int i=0;i<9;i++){
            if(sudoku[row][i] ==num || sudoku[i][col]==num){
                return false;   
            }
        }    
            int startrow = row - row % 3;
            int startcol = col - col % 3;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(sudoku[startrow + i][startcol + j] == num){
                        return false;
                    }
                }
            }
            return true;
    }

    static boolean solve(){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(sudoku[row][col]==0){
                    for(int num=1;num<=9;num++){
                        if(isSafe(row,col,num)){
                            sudoku[row][col]=num;
                            if(solve()){
                                return true;
                            }
                            sudoku[row][col]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static void printsudoku(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("Original Sudoku : ");
        printsudoku();
        if(solve()){
        System.out.println("\nSudoku after Solved : ");
        printsudoku();
        }
        else{
            System.out.println("No solution Exists");
        }
    }
}