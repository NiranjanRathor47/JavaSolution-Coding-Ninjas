package Array2D;
import java.util.Scanner;
public class IntroOf2Darray {

	public static void main(String[] args) {
//		int arr2d[][] = new int [3][4];
//		System.out.println(arr2d[1][2]);
//        arr2d[2][2] = 15;
//        System.out.println(arr2d[2][2]);
		
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
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
	}
	}
}
