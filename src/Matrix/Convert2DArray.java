package Matrix;
import java.util.*;

public class Convert2DArray {

	/*
	 * public static void main(String[] args) {
	 * 
	 * List<List<Integer>> list = new ArrayList<List<Integer>>(); for (int i = 0; i
	 * < 10; i++) { List<Integer> integers = new ArrayList<Integer>(); for (int j =
	 * 0; j < 5; j++) { Random random = new Random();
	 * integers.add(random.nextInt()); } list.add(integers); } int[][] array = new
	 * int[list.size()][]; for (int i = 0; i < array.length; i++) { array[i] = new
	 * int[list.get(i).size()]; } for (int i = 0; i < list.size(); i++) { for (int j
	 * = 0; j < list.get(i).size(); j++) { array[i][j] = list.get(i).get(j); } }
	 * System.out.println(Arrays.deepToString(array));
	 * 
	 * }
	 */

	// Assume proper imports

	public static void main(String[] args) throws Throwable {

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		// Just for example consider this 2D List
		int n = 7;
		int m = 7;
		// int[][] array = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 3 }, { 2, 5 }, { 5, 6 },
		// { 3, 4 } };
		for (int i = 0; i < 7; i++) {
			ArrayList<Integer> list1 = new ArrayList<>();
			if (i == 0) {
				list1.add(1);
				list1.add(2);
			}
			if (i == 1) {
				list1.add(3);
			}
			if (i == 2) {
				list1.add(3);
				list1.add(5);
			}
			if (i == 3) {
				list1.add(4);
			}
			if (i == 5) {
				list1.add(6);
			}
			list.add(i, list1);
		}

		int[][] array = new int[n][m];
		// list.size() will be n
		// list.get(i).size() will be m
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				array[i][j] = list.get(i).get(j);
			}
		}

		list.forEach(System.out::println);
		System.out.println();
		System.out.println(Arrays.deepToString(array));
	}

}
