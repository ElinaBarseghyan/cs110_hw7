package utils;
public class ArrayUtils {
	public static void reverse(int[] arr) {
		 for (int i = 0; i < (arr.length - 1)/2; i++) {
		 	arr[i] = arr[i] + arr[arr.length - i - 1];
		 	arr[arr.length - i - 1] = arr[i] - arr[arr.length - i - 1];
		 	arr[i] = arr[i] - arr[arr.length - i - 1];
		 }
	}
	public static String stringifyArray(int[] arr) {
		String result = "" + arr[0];
		for(int i = 0; i < arr.length; i++) {
			result = result + "," + arr[i];
		}
		return result;
	}
}
