package Array2D;
import java.util.Scanner;
public class SpiralArray {
	public static void spiralPrint(int matrix[][]){
		int m = matrix.length;
		if(m==0) {
   			return ;
   		}
		int n = matrix[0].length;
		int i, k = 0, l = 0;
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for (i = k; i < m; ++i) {
                System.out.print(matrix[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(matrix[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
	}
	  public static int [][] takeinput(){
	    	Scanner s = new Scanner(System.in);
			int row = s.nextInt();
			int col = s.nextInt();
			int input[][] = new int[row][col];
	    	for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					input[i][j] = s.nextInt();
				}
			}
	      return input ;
	    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int input [][] = takeinput();
			spiralPrint(input);
			t--;
		}
	}

}
