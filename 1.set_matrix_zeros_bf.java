// space complexiity O(1)
// time complexity O(N*M*(N+M))  O(n^3) type

import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int rows = matrix.length, cols = matrix[0].length;
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                if(matrix[i][j] == 0){
                    // set the columns upto this as zero
                    int ind = i-1;
                    // going up in the rows with the condition
                    while(ind >= 0){
                        // see? it the rows, then column (j) is the same
                        if (matrix[ind][j] != 0){
                            matrix[ind][j] = -1;
                        }
                        ind--;
                    }
                    // now set the columns below this to zero
                    ind = i+1;
                    // now start making the same column at rows zero
                    while (ind < rows){
                        if (matrix[ind][j] != 0){
                            matrix[ind][j] = -1;
                        }
                        ind++;
                    }
                    // now make that particular row as zero
                    ind = j-1;
                    while(ind>=0){
                        if(matrix[i][ind] != 0){
                            matrix[i][ind] = -1;
                        }
                        ind--;
                    }
                    // now after this entery make the cols zero
                    ind = j+1;
                    while(ind<cols){
                        if(matrix[i][ind] != 0){
                            matrix[i][ind] = -1;
                        }
                        ind++;
                    }
                }
            }
        }
        // now make all -1 to zero
        for(int i =0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
        //for(int i =0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 System.out.print(matrix[i][j]+" ");
//                 }
//             System.out.println();
//             }
        }
    }
    

