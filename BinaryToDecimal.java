import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rem=0,count=0 ;
		double sum=0,result;
		
		while(n!=0) {
			 rem = n % 10;
	         n = n / 10;
	        result = Math.pow(2,count);
	        sum = sum +result*rem;
	         count++;
		}
		int r = (int)(sum);
		 System.out.print(r);
		
	}
}
