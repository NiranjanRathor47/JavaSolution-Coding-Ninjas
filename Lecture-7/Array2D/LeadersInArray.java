package Array2D;

public class LeadersInArray {
	public static void leaders(int[] input) {
		for(int i =0;i<input.length;i++){
            int j=0;
            for( j=i+1;j<input.length;j++){
                if(input[i]<input[j]){
                    break ;
                }
            }
            if(j == input.length){
                System.out.print(input[i] +" ");
            }
        }
	}
}
