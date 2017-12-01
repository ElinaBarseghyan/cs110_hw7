package utils;
public class Math {
	public static long factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
	public static long factorialLoop(int n) {
		long result = 1;
		for(int i = 0; i < n; i++) {
			result = result * (i + 1);
		}
		return result;
	}
}