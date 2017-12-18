import java.util.*;
public class Mode {
	public static void main(String[] args) {
		Random gRandom = new Random();
		int[] rolls = new int[20];
		for(int i = 0; i < 20; i++)
			rolls[i] = gRandom.nextInt(6)+1;

		ArrayList<Integer> mode = new ArrayList<Integer>();
		int[] counter = new int[6];
		int max = 0;
		for(int i = 0; i < 20; i++)
			counter[rolls[i]-1]++;

		for(int i = 0; i < counter.length; i++)
			if(counter[i] > max) {
				mode.clear();
				mode.add(i+1);
				max = counter[i];
			}
			else if(counter[i] == max)
				mode.add(i+1);

		for(int i : rolls)
			System.out.print(i + " ");
		System.out.println("\nModes: ");
		for(Integer j : mode)
			System.out.print(j + " ");
	}
}