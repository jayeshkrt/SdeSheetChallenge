import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> A) 
	{
		// if there is no word
        // if (A == null || A.size() <= 1) return null;
        int i = A.size()-2;
        while (i>=0 && A.get(i) >= A.get(i+1)) i--;
        if(i >= 0){
            int j = A.size() - 1;
            while(A.get(j) <= A.get(i)) j--;
            swap(A, i, j);
        }
        return reverse(A, i+1, A.size()-1);
	}
    
    public static void swap(ArrayList<Integer> A, int i, int j){
        int tmp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, tmp);
    }
    
    public static ArrayList<Integer> reverse(ArrayList<Integer> A, int i, int j){
        while(i < j) Collections.swap(A, i++, j--);
        return A;
    }
}
