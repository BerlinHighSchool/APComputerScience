import java.util.Arrays;

public class ArrayQuestion {
	public static void main(String[] args) {
		int[] array = {12, 5, 8, 9, 3, 2, 1, 5};
		int[] arr2 = array;
		sortMyArray(arr2);
		for(int i : arr2)
			System.out.print(i + " ");
		System.out.println();
		for(int i : array)
			System.out.print(i + " ");
	}
	
	public static void sortMyArray(int[] arr1) {
		Arrays.sort(arr1);
		for(int i : arr1)
			System.out.print(i + " ");
		System.out.println();
	}
}