import java.util.Random;

public class SearchMethods {
	public static void main(String[] args) {
		Random g = new Random();
		int[] randarray = new int[100];
		int start = g.nextInt(20)+1;
		for(int i = 0; i < randarray.length; i++)
			randarray[i] = start+i;
		//System.out.println(linearSearch(randarray, 45));
		System.out.println(binarySearch(randarray, 45));
		for(int x : randarray)
			System.out.print(x + " ");
	}
	
	private static int linearSearch(int[] array1, int value) {
		for(int i = 0; i < array1.length; i++)
			if(array1[i] == value)
				return i;
		
		return -1;
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
