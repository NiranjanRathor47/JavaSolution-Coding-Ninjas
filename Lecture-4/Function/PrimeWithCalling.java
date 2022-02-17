package Function;
import java.util.Scanner;
public class PrimeWithCalling {

	public static boolean isprime(int n) {
		  int d=2;
		  while(d<n) {
			  if(n%d==0) {
				  return false;
			  }
			  d++;
		  }
		  return true;
	}
	public static void printprimes(int n) {
		for(int i=2;i<=n;i++) {
		boolean isIprime = isprime(i);
		if(isIprime){
			System.out.println(i);
		}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int p =s.nextInt();
        printprimes(p);
         }

}
