package Array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the number of Rows: ");
		int rows = sc.nextInt();
		System.out.println("Please enter the number of Columns: ");
		int col = sc.nextInt();
		
		int[][] numbers = new int[rows][col];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				
				System.out.println("Please enter the numbers: ");
				numbers[i][j]=sc.nextInt();
			}
	
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
	
		}
	}

}
