package WhileLoop;
import java.util.Scanner;
public class SumEvenOdd {
		public static void main(String[] args) {
				try(Scanner s = new Scanner(System.in))
				{
					int n = s.nextInt();
		            int rem = 0;
		        int sumeven =0 , sumodd =0 ;
		        while(n!=0){
		            rem = n%10;
		            if(rem%2==0){
		                sumeven += rem;
		            }
		            else
		            {
		                sumodd += rem;
		            }
		        }
		        System.out.println(sumeven+ " " +sumodd);
			}
				}
				
	

}
