
//placing of element like ABC in other other formats
// public class Backtracking {
//     public static void place(String str , int ind , String perm){
//         if (str.length()==0){
//             System.out.println(perm);
//             return;
//         }
//         for (int i=0 ; i<str.length() ; i++){
//             char c = str.charAt(i);
//             String s = str.substring(0,i) + str.substring(i+1);
//             place(s , ind+1 , perm+c);
//         }
//     }
//     public static void main(String[] args){
//         place("ABC" , 0 , "");
//     }
// }


//print all solution where all queens are safe given N*N chessboard and N queens
// public class Backtracking {   
//     public static void main(String[] args) {
//         int n = 4;
//         char[][] board = new char[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j] = 'X';
//             }
//         }
//         queens(board, 0);
//     }

//     public static void queens(char[][] board, int row) {
//         int n = board.length;
//         if (row == n) {
//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n; j++) {
//                     System.out.print(board[i][j]);
//                 }
//                 System.out.println();
//             }
//             return;
//         }

//         for (int j = 0; j < n; j++) {
//             if (issafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 queens(board, row+1);
//                 board[row][j] = 'X';
//             }
//         }

//     }

//     public static boolean issafe(char[][] board, int row, int col) {
//         int n = board.length;

//         // check col
//         for (int i = 0; i < n; i++) {
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }

//         // check row
//         for (int j = 0; j < n; j++) {
//             if(board[row][j] == 'Q'){
//             return false;
//             }
//         }

//         int i = row;
//         int j = col;
//         while (i >= 0 && j >= 0) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//             i--;
//             j--;
//         }

//         i = row;
//         j = col;
//         while (i < n && j < n) {
//             if (board[i][j] == 'Q')
//                 return false;
//             i++;
//             j++;
//         }

//         i = row;
//         j = col;
//         while (i >= 0 && j < n) {
//             if (board[i][j] == 'Q')
//                 return false;
//             i--;
//             j++;
//         }

//         i = row;
//         j = col;
//         while (i < n && j >= 0) {
//             if (board[i][j] == 'Q')
//                 return false;
//             i++;
//             j--;
//         }

//         return true;

//     }
// }




//check validation of soduku
// public class Backtracking {
//     public static boolean isValid(int[][] board, int row, int col, int num) {
//         // row
//         for (int j = 0; j < 9; j++) {
//             if (board[row][j] == num)
//                 return false;
//         }

//         // col
//         for (int i = 0; i < 9; i++) {
//             if (board[i][col] == num)
//                 return false;
//         }

//         int sr = row / 3 * 3;
//         int sc = col / 3 * 3;
//         for (int i = sr; i < sr + 3; i++) {
//             for (int j = sc; j < sc + 3; j++) {
//                 if (board[i][j] == num)
//                     return false;
//             }
//         }

//         return true;

//     }

//     public static boolean isValidSudoku(int[][] board) {
//         int num;
//         for (int i = 0; i < 9; i++) {
//             for (int j = 0; j < 9; j++) {
//                 if (board[i][j] != 0) {
//                     num = board[i][j];
//                     board[i][j] = 0;
//                     if ((isValid(board, i, j, num)) == false)
//                         return false;
//                     board[i][j] = num;
//                 }
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int[][] board = {
//                 { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
//                 { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
//                 { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
//                 { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
//                 { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
//                 { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
//                 { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
//                 { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
//                 { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
//         };

//         if (isValidSudoku(board)) {
//             System.out.println("Valid Sudoku");
//         } else {
//             System.out.println("Invalid Sudoku");
//         }
//     }
// }


// sudoku formation
public class Backtracking {
    public static boolean isValid(char[][] board, int row, int col, char num) {
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num)
                return false;
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num)
                return false;
        }
        int sr = row / 3 * 3;
        int sc = col / 3 * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }
        return true;
    }
    public static boolean solveSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '0') 
                {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;
                            if (solveSudoku(board)) {
                                return true;
                            }
                            board[row][col] = '0'; // Backtrack
                        }
                    }
                    return false; // No valid number found, need to backtrack
                }
            }
        }
        return true; // All cells filled successfully
    }
    public static void printSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '0', '0', '7', '0', '0', '0', '0'},
            {'6', '0', '0', '1', '9', '5', '0', '0', '0'},
            {'0', '9', '8', '0', '0', '0', '0', '6', '0'},
            {'8', '0', '0', '0', '6', '0', '0', '0', '3'},
            {'4', '0', '0', '8', '0', '3', '0', '0', '1'},
            {'7', '0', '0', '0', '2', '0', '0', '0', '6'},
            {'0', '6', '0', '0', '0', '0', '2', '8', '0'},
            {'0', '0', '0', '4', '1', '9', '0', '0', '5'},
            {'0', '0', '0', '0', '8', '0', '0', '7', '9'}
        };
        if (solveSudoku(board)) {
            printSudoku(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}


// import java.util.*;

// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         char[][] board = new char[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j] = 'X';
//             }
//         }
//         queens(board, 0);
//     }

//     private static void queens(char[][] board, int row) {
//         int n = board.length;
//         if (row == n) {
//             printQueens(board);
//             return;
//         }
//         for (int j = 0; j < n; j++) {
//             if (isSafe(row, j, board)) {
//                 board[row][j] = 'Q';
//                 queens(board, row + 1);
//                 board[row][j] = 'X'; // backtrack
//             }
//         }
//     }

//     private static boolean isSafe(int row, int col, char[][] board) {
//         int n = board.length;

//         // Check column
//         for (int i = 0; i < n; i++) {
//             if (board[i][col] == 'Q') return false;
//         }

//         // Check upper diagonal on left side
//         for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 'Q') return false;
//         }

//         // Check upper diagonal on right side
//         for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
//             if (board[i][j] == 'Q') return false;
//         }

//         return true;
//     }

//     private static void printQueens(char[][] board) {
//         int n = board.length;
//         StringBuilder sb = new StringBuilder();
//         sb.append("{");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (board[i][j] == 'Q') {
//                     sb.append(i + 1).append("-").append(j + 1);
//                     if (i != n - 1 || j != n - 1) {
//                         sb.append(" ");
//                     }
//                 }
//             }
//         }
//         sb.append("}");
//         System.out.print(sb.toString() + " ");
//     }
// }
