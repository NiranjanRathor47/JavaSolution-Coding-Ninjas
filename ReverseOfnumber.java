import java.util.Scanner;
public class ReverseOfnumber {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int rem=0,i;
	
	while(n!=0) {
		 rem = rem * 10 + n % 10;
         n = n / 10;
	}
	 System.out.print(rem);
	
	}
}
