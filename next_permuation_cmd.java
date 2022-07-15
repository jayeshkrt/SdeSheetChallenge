import java.util.Scanner;

public class next_permutation{
	// Object for input
	static Scanner inputObject = new Scanner(System.in);

	public static void main(String []args){
		// Declare integer 'T' (Number of testcases)
		int T;
		// & read it from Standard Input
		T = inputObject.nextInt();
		// loop through the number of Test Cases  [1,T]
		for (int test_case = 1; test_case <= T; ++test_case){
			// print the test case number to standard output
			System.out.print("Case #" + test_case + ": ");
			// Call the solve function
			solve();
		}

		// close the object for input
		inputObject.close();
	}

	static void solve(){
		// decalre the integer N 
		int N;

		// Read Integers N from Standard Input
		N = inputObject.nextInt();
		// Declare array C of size 'N'
		int[] C = new int[N];
		for (int i = 0; i < N; ++i){
			C[i] = inputObject.nextInt();
		}
		// pass this array to function
		// int[] result = new int[N];
		// result = nextPermutation(C);
		nextPermutation(C);

		for (int i = 0; i<N; ++i){
			System.out.print(C[i]+" ");
		}
		System.out.println();
	}

	public static void nextPermutation(int[] A){
		if (A == null || A.length <= 1) return;

		int i = A.length - 2;
		while (i >= 0 && A[i] >= A[i+1]) i--;

		if (i >= 0){
			int j = A.length - 1;
			while (A[j] <= A[i]) j--;
			swap(A, i, j);
		}
		reverse(A, i+1, A.length-1);
	}

	public static void swap(int[] A, int i, int j){
		int tmp = A[j];
		A[j] = A[i];
		A[i] = tmp;
	}

	public static void reverse (int[] A, int i, int j){
		while(i < j) swap(A, i++, j--);
	}
}
