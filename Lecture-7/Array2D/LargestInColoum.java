package Array2D;

import java.util.Scanner;

public class LargestInColoum {
	public static int largestsum(int [][] arr) {
		int max = Integer.MIN_VALUE;
		int row  = arr.length;
		int col = arr[0].length;
		for(int j=0;j<col;j++) {
			int sum = 0;
			for(int i=0;i<row;i++) {
				sum += arr[i][j];
			}
			if(sum>max) {
				max = sum ;
			}
		}
		return max ;
	}
    public static int [][] takeinput(){
    	Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int input[][] = new int[row][col];
    	for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("enter element at "+i+" row "+j+" coloum");
				input[i][j] = s.nextInt();
			}
		}
      return input ;
    }
	public static void print (int [][] input ) {
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input[i].length;j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
	}
	}
	public static void main(String[] args) {
		int input [][] = takeinput();
		print(input);
		System.out.println(largestsum(input));
	}

}
