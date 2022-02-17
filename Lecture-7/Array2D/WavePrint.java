package Array2D;
import java.util.Scanner;
public class WavePrint {
	public static void wavePrint(int mat[][]){
		System.out.println();
		int row=mat.length;
		if(row==0) {
   			return ;
   		}
		int col=mat[0].length;
		for(int i=0;i<col;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<row;j++)
				{
					System.out.print(mat[j][i]+" ");
				}
			}
			else
			{
				for(int j=row-1;j>=0;j--)
				{
					System.out.print(mat[j][i]+" ");
				}
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
			wavePrint(input);
			t--;
		}
	}

}
