public class LinearSearch {

	public static int linearSearch(int[] array, int value, int first, int last) {
		for (int i = first; i <= last; i++) {
			if (array[i] == value)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 0, 5, 7 };
		System.out.println(LinearSearch.linearSearch(arr, 3, 0, arr.length - 1));
	}

}
