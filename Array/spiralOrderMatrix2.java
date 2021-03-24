/*Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.

INPUT FORMAT:

The first and the only argument contains an integer, A.

OUTPUT FORMAT:

Return a 2-d matrix of size A x A satisfying the spiral order.

CONSTRAINTS:

1 <= A <= 1000

EXAMPLES:

Input 1:
    A = 3

Output 1:
    [   [ 1, 2, 3 ],
        [ 8, 9, 4 ],
        [ 7, 6, 5 ]   ]

Input 2:
    4

Output 2:
    [   [1, 2, 3, 4],
        [12, 13, 14, 5],
        [11, 16, 15, 6],
        [10, 9, 8, 7]   ]


*/

import java.util.*;

class Solution {
	
	int[][] generateMatrix(int n) {
		int top = 0;
		int left = 0;
		int bottom = n-1;
		int right = n-1;
		int c = 1;
		int[][] mat = new int[n][n];
		while(c <= n*n) {
			for(int i=left;i<=right;i++) { 
				mat[top][i] =c;
				c++;
				
			}
			top+=1;
			for(int i=top;i<=bottom;i++) {
				mat[i][right] =c;
				c++;
			}
			right -= 1;
		
			for(int i=right;i>=left;i--) {
				mat[bottom][i] =c;
				c++;
			}
			bottom -= 1;
	
			for(int i=bottom;i>= top;i--) {
				mat[i][left] =c;
				c++;
			}
			left += 1;
			
		}
		return mat;	
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Solution s = new Solution();
		int[][] mat = s.generateMatrix(n);
		for(int i=0; i<mat.length;i++ ){
			for(int j =0;j<mat.length;j++) {
			System.out.print(mat[i][j] + " ");
			}
			System.out.println();

		}
	}
	

}
