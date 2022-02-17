package Array2D;
import java.util.Scanner;
public class RowWiseSum {
	public static void rowWiseSum(int[][] mat) {
		int sum =0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				sum = sum + mat[i][j];	
			}
			 System.out.print(sum + " ");
            sum = 0;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
	    while(t>0) {
	    	int row = s.nextInt();
			int col = s.nextInt();
			int input[][] = new int[row][col];
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					input[i][j] = s.nextInt();
				}
			}
			rowWiseSum(input);
	      t--;
	    }
	}
}
