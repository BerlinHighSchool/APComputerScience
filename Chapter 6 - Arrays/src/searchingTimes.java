import java.util.*;
public class searchingTimes 
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int[] random1 = new int[500000];
		for(int i = 0; i < random1.length; i++)
			random1[i] = i;

		int found1 = linearSearch(random1, 499999);
		if(found1 != -1)
			System.out.println("Your value was found at index " + found1);
		else
			System.out.println("Your value was not found.");

		System.out.println("\n" + (System.currentTimeMillis() - startTime) + " milliseconds");

		startTime = System.currentTimeMillis();

		random1 = new int[500000];
		for(int i = 0; i < random1.length; i++)
			random1[i] = i;

		found1 = binarySearch(random1, 499999);
		if(found1 != -1)
			System.out.println("Your value was found at index " + found1);
		else
			System.out.println("Your value was not found.");

		System.out.println("\n" + (System.currentTimeMillis() - startTime) + " milliseconds");
	}
	public static int linearSearch(int[] test, int search)
	{
		for(int i = 0; i < test.length; i++)
			if(search == test[i])
				return i; // <-- returns the index at which it was located
		return -1; // <-- was not found
	}

	private static int binarySearch(int[] array1, int value) {
		int low = 0, high = array1.length-1, mid = (low+high)/2;
		while(array1[mid] != value && low <= high) {
			if(value < array1[mid])
				high = mid - 1;
			else
				low = mid + 1;

			mid = (low+high)/2;
		}
		if(array1[mid] == value)
			return mid;
		else
			return -1;
	}
}
