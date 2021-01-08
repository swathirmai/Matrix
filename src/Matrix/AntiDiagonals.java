package Matrix;
import java.util.*;

public class AntiDiagonals {

	public static void main(String[] args) {
		AntiDiagonals main = new AntiDiagonals();

		int[][] matrix = new int[][]{{12, 7, 21, 31, 11},
			{45, -2, 14, 27, 19},
			{-3, 15, 36, 71, 26},
			{4, -13, 55, 34, 15}};

			System.out.println(main.diagonal(matrix));


			int[][] matrix2 = new int[][]{{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};

				System.out.println(main.diagonal(matrix2));
	}

	public List<List<Integer>> diagonal(int[][] matrix) {
		List<List<Integer>> result = new ArrayList<>();

		int m = matrix.length;
		int n = matrix[0].length;

		for (int i=0;i<m+n-1;i++) {
			List<Integer> diag = new ArrayList<>();

			int row = i < n ? 0 : i - n + 1;
			int col = i < n ? i : n - 1;

			while (row < m && col >= 0) {
				diag.add(matrix[row][col]);
				row++;
				col--;
			}

			result.add(diag);
		}

		return result;
	}
}