package Matrix;

public class Search2DMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,   3,  5,  7},
				{10, 11, 16, 20},
				{23, 30, 34, 50}			
		};

		System.out.println(searchMatrixTest(matrix,7));

	}

	public boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		if (m == 0)
			return false;
		int n = matrix[0].length;

		// binary search
		int left = 0, right = m * n - 1;
		int pivotIdx, pivotElement;
		while (left <= right) {
			pivotIdx = (left + right) / 2;
			pivotElement = matrix[pivotIdx / n][pivotIdx % n];
			if (target == pivotElement)
				return true;
			else {
				if (target < pivotElement)
					right = pivotIdx - 1;
				else
					left = pivotIdx + 1;
			}
		}
		return false;
	}

	public static boolean searchMatrixTest(int[][] matrix, int target) {
		if(matrix==null || matrix.length==0 || matrix[0].length==0) 
			return false;

		int m = matrix.length;
		int n = matrix[0].length;

		int start = 0;
		int end = m*n-1;

		while(start<=end){
			int mid=(start+end)/2;
			int midX=mid/n;
			int midY=mid%n;

			if(matrix[midX][midY]==target) 
				return true;

			if(matrix[midX][midY]<target){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}

		return false;
	}

} 


