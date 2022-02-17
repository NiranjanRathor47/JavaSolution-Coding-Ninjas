package Array2D;
import java.util.Scanner;
public class LargestRowOrColumn {
      public static void findLargest(int mat[][]){
    	int max = Integer.MIN_VALUE;
  		int row  = mat.length;
   		int count =0 ,count1=0 ;
   		if(row==0) {
   			System.out.println("row "+count+" "+max);
   			return ;
   		}
   		int col = mat[0].length;  // initialize after that
  		for(int j=0;j<col;j++) {
  			int sum = 0;
  			for(int i=0;i<row;i++) {
  				sum += mat[i][j];
  			}
  			if(sum>max) {
  				max = sum ;
  				count=j;
  			}
  		}
  		int largest = Integer.MIN_VALUE;
  		for(int i=0;i<row;i++) {
  			int sum1 = 0;
  			for(int j=0;j<col;j++) {
  				sum1 += mat[i][j];
  			}
  			if(sum1>largest) {
  				largest = sum1 ;
  				count1=i;
  			}
  		}
  		if(largest>=max) {
  			System.out.println("row "+count1+" "+largest);
  		}
  		else {
  			System.out.println("column "+count+" "+max);
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
			findLargest(input);
			t--;
			}
		}
}
