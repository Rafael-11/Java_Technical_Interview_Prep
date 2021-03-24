package most_asked;

public class FindLargestArrayWithoutSortMethod {
	public static void main(String[] args) {
		// Find the largest array without using Sort() method

		int[] arr = { 4, 7, 2, 3 };

		System.out.println(getLargestArray(arr, arr.length));

	}

	public static int getLargestArray(int[] a, int total) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		return a[total - 1];
	}

}
