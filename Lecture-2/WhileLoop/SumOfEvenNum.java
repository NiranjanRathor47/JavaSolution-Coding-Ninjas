package WhileLoop;
import java.util.Scanner;
public class SumOfEvenNum {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in))
		{
			int n = s.nextInt();
			int sum =0;
			int i=1;
			while(i<=n) {
				if(i%2==0) {
					sum  = sum + i;
				}
				i++;
			}
			System.out.println(sum);
		}
		
	}
}
