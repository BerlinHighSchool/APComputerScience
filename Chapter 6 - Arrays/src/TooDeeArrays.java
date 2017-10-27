import java.util.Random;

public class TooDeeArrays {
	public static void main(String[] args) {

		int[][] numarray = new int[5][5];
		Random g = new Random();
		/*
		for(int r = 0; r < numarray.length; r++)
			for(int c = 0; c < numarray[r].length; c++)
				numarray[r][c] = g.nextInt(25)+3;

		for(int r = 0; r < numarray.length; r++) {
			for(int c = 0; c < numarray[r].length; c++)
				System.out.print(numarray[r][c] + "\t");
			System.out.println();
		}
		 */
		// Generate a 3x3 2D array randomly filled with x's and o's.
		// Determine how many 3 x's or 3 o's are in a row (vertical
		// horizontal and/or diagonal).
		char[][] tictactoe = new char[3][3];

		for(int r = 0; r < tictactoe.length; r++)
			for(int c = 0; c < tictactoe[r].length; c++)
				if(g.nextInt(2) == 0)
					tictactoe[r][c] = 'x';
				else
					tictactoe[r][c] = 'o';

		for(int r = 0; r < tictactoe.length; r++) {
			for(int c = 0; c < tictactoe[r].length; c++)
				System.out.print(tictactoe[r][c] + "\t");
			System.out.println();
		}
		int xcount = 0, ocount = 0;
		// Horizontal
		for(int r = 0; r < tictactoe.length; r++) {
			for(int c = 0; c < tictactoe[r].length-1; c++) {
				if(tictactoe[r][c] != tictactoe[r][c+1])
					break;
				if(c+1 == tictactoe[r].length-1 && tictactoe[r][c] == 'x')
					xcount++;
				else if(c+1 == tictactoe[r].length-1 && tictactoe[r][c] == 'o')
					ocount++;
			}
		}

		// Vertical
		for(int r = 0; r < tictactoe.length; r++) {
			for(int c = 0; c < tictactoe[r].length-1; c++) {
				if(tictactoe[c][r] != tictactoe[c+1][r])
					break;
				if(c+1 == tictactoe[r].length-1 && tictactoe[c][r] == 'x')
					xcount++;
				else if(c+1 == tictactoe[r].length-1 && tictactoe[c][r] == 'o')
					ocount++;
			}
		}

		// Diagonal 1 - left top to bottom right
		for(int r = 0, c = 0; r < tictactoe.length-1; r++, c++) {
			if(tictactoe[r][c] != tictactoe[r+1][c+1])
				break;
			if(c+1 == tictactoe[r].length-1 && tictactoe[r][c] == 'x')
				xcount++;
			else if(c+1 == tictactoe[r].length-1 && tictactoe[r][c] == 'o')
				ocount++;
		}

		// Diagonal 2 - right top to bottom left
		for(int r = 0, c = tictactoe.length-1; r < tictactoe.length-1; r++, c--) {
			if(tictactoe[r][c] != tictactoe[r+1][c-1])
				break;
			if(r+1 == tictactoe[r].length-1 && tictactoe[r][c] == 'x')
				xcount++;
			else if(r+1 == tictactoe[r].length-1 && tictactoe[r][c] == 'o')
				ocount++;
		}

		System.out.println("x count: " + xcount);
		System.out.println("o count: " + ocount);
	}
}
