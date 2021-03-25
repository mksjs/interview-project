/*
Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example:

Given the following matrix:

[
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
]

You should return

[1, 2, 3, 6, 9, 8, 7, 4, 5]


*/

import java.util.*;

class Solution {
	static int[] spiralMatrix(int A[][] ) {
		int len = A.length;
		int [] ans = new int[len*len];
		int top = 0 ;
		int left = 0 ;
		int right = len - 1 ;
		int bottom = len - 1 ; 	
		int i = 0 ;
		while(i < len*len) {
			for(int j = left; j <= right; j++) {
				ans[i++] = A[top][j];
			}	
			top += 1;
			for(int j = top; j <= bottom; j++) {
				ans[i++] = A[j][right];
			}	
			right -= 1;
			for(int j = right; j >= left; j--) {
				ans[i++] = A[bottom][j];
			}	
			bottom -= 1;
			for(int j = bottom; j >= top; j--) {
				ans[i++] = A[j][left];
			}	
			left += 1;
		}
		return ans;
	}
	
	public static void main(String args[]) {
		int A[][] = {{1,2,3}, {4,5,6},{7,8,9}};
		int ans[] = Solution.spiralMatrix(A);
		
		for(int i = 0; i < ans.length ; i++ ) {
			System.out.print(ans[i] +" ");
		} 
	}
}	

