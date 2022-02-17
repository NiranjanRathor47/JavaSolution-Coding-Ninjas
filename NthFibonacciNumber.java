import java.util.Scanner;
public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a =0 ,b=1,i;
		int c;
		
        for(i=1;i<=n;i++) {
        	c=a+b;
        	a=b;
        	b=c;
        }
      System.out.println(a);
	}

}
