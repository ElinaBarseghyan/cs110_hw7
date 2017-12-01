package utils;
public class ArrayUtils {
	public static void reverse(int[] arr) {
		 for (int i = 0; i <= (arr.length - 1)/2; i++) {
		 	arr[i] = arr[i] + arr[arr.length - 1 - i];
		 	arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i];
		 	arr[i] = arr[i] - arr[arr.length - 1 - i];
		 }
	}
	public static String stringifyArray(int[] arr) {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			result = result + arr[i];
		}
		return result;
	}
}