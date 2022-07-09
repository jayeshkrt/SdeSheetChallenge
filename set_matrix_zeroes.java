import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // record rows and columns
        int rows = matrix.length, cols = matrix[0].length;
        
        // now make 2 dummy arrays
        // for rows
        int row_arr[] = new int[rows];
        // for cols
        int col_arr[] = new int[cols];
        
        // fill the arays with -1
        Arrays.fill(row_arr, -1);
        Arrays.fill(col_arr, -1);
        
        // now traverse over the matrix and update the rows and cols array where zero is there
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == 0){
                    row_arr[i] = 0;
                    col_arr[j] = 0;
                }
            }
        }
        
        // now again traverse but update according to the arrays
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(row_arr[i] == 0 || col_arr[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }

}
