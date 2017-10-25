import java.util.Random;

public class TooDeeArrays {
	public static void main(String[] args) {
		int[][] numarray = new int[5][5];
		Random g = new Random();

		for(int r = 0; r < numarray.length; r++)
			for(int c = 0; c < numarray[r].length; c++)
				numarray[r][c] = g.nextInt(25)+3;

		for(int r = 0; r < numarray.length; r++) {
			for(int c = 0; c < numarray[r].length; c++)
				System.out.print(numarray[r][c] + "\t");
			System.out.println();
		}

		// Generate a 3x3 2D array randomly filled with x's and o's.
		// Determine how many 3 x's or 3 o's are in a row (vertical
		// horizontal and/or diagonal.
		char[][] tictactoe = new char[3][3];
		
		for(int r = 0; r < tictactoe.length; r++)
			for(int c = 0; c < tictactoe[r].length; c++)
				if(g.nextInt(1) == 0)
					tictactoe[r][c] = 'x';
				else
					tictactoe[r][c] = 'o';

		
	}
}
