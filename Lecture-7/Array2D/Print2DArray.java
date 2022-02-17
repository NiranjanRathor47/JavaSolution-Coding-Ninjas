package Array2D;

public class Print2DArray {
	public static void print2DArray(int input[][]) {
        if(input.length==0){
            return ;
        }
		int rowlength = input.length -1 ;
        for(int i=0;i<input.length;i++){
            for(int k=0;k<=rowlength;k++){
                for(int j=0;j<input[0].length;j++){
                    System.out.print(input[i][j] + " ");
                }
                System.out.println();
            }
            rowlength--;
        }

	}
}
