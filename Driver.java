import utils.Math;
import utils.ArrayUtils;
import animals.Puppy;
public class Driver{
	public static void main(String[] args) {
		Puppy puppy1 = new Puppy("Joey");
		System.out.println(puppy1.getName());
		Puppy puppy2 = new Puppy("Chandler");
		System.out.println(puppy2.getName());
		Puppy puppy3 = new Puppy("Ross");
		System.out.println(puppy3.getName());

		int[] arr = {9, 20, 3, 44, 88, 300};
		ArrayUtils.reverse(arr);
		System.out.println(ArrayUtils.stringifyArray(arr));
		double doub = 15.4;
		System.out.println(Math.factorial((int)doub));
	}
}