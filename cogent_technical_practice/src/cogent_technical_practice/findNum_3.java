package cogent_technical_practice;

import java.util.Arrays;

public class findNum_3 {
	public static int findNum(int[][] arr) {
		int n = arr.length; // number of rows
		int m = arr[0].length; // number of columns

		// Find the maximum element in each row
		int[] maxInRow = new int[n];
		for (int i = 0; i < n; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < m; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			maxInRow[i] = max;
		}

		// Find the minimum element in each column
		int[] minInColumn = new int[m];
		Arrays.fill(minInColumn, Integer.MAX_VALUE);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] < minInColumn[j]) {
					minInColumn[j] = arr[i][j];
				}
			}
		}

		// Find the element that is both the maximum in its row and the minimum in its
		// column
		int result = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == maxInRow[i] && arr[i][j] == minInColumn[j]) {
					result = arr[i][j];
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] A = {{2, 2}, {1,2}, {3,4}};
		System.out.println(findNum(A));

	}

}
