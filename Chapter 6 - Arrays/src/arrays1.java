import java.util.*;

public class arrays1 {
	public static void main(String[] args){
		/*
		int[] array1 = new int[100];
		for(int i = 0; i < array1.length; i++)
			array1[i] = 2*(i+1);
		
		int[] array2 = new int[4];
		for(int k : array2)
			System.out.println(k);
		
		// Create an array of 100 random ints between 2-200
		Random g = new Random();
		int[] random1 = new int[100];
		for(int i = 0; i < random1.length; i++)
			random1[i] = g.nextInt(199) + 2;
		
		// Count how many values in random1 also appear in array1
		int count = 0;
		for(int i : random1)
			for(int k : array1)
				if(i == k)
					count++;
		
		System.out.println(count);
		
		int count1 = 0;
		for(int i = 0 ; i < random1.length; i++)
			for(int j = 0; j <array1.length; j++)
				if(random1[i] == array1[j])
					count1++;
		
		System.out.println(count1);
		
		// for-each loop
		//for each integer k within array1
		for(int k : random1)
			System.out.print(k + " ");
		
		System.out.println();
		
		for(int i = 0; i < array1.length; i++)
			System.out.print(array1[i] + " ");
		*/
		String name = "Random string";
		char[] charToString = name.toCharArray();
		for(char x : charToString)
			System.out.println(x);
		
		// Array Searching & Array Sorting
		
	}
}
