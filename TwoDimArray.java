package week03;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		
		
		if(args.length < 2)
		{
			System.out.println("Enter the coordinates!");
		}
		char[] row0 = {'A', 'B', 'C', 'D'};
		char[] row1 = {'X', 'E', 'F', 'G'};
		char[] row2 = {'H', 'I', 'K', 'L'};
		char[] row3 = {'M', 'N', 'O', 'P'};
		char[] [] table = new char[4][4];
		//populate the 2 dimensional array
		table[0] = row0;
		table[1] = row1;
		table[2] = row2;
		table[3] = row3;
		
//		System.out.println("Please enter coordinates: ");
//		Scanner scanner = new Scanner(System.in);
//		int row = scanner.nextInt();
//		int column = scanner.nextInt();
		
		int row = Integer.parseInt(args[0]);
		int column = Integer.parseInt(args[1]);
		
		if(row >= table.length || column >= table.length)
		{
			System.out.println("Invalid coordinates. " + row + " , " + column);
		}
		System.out.println("The data at row " + row + ", column " + column + " is " + table[row][column]);
		
	}

}
