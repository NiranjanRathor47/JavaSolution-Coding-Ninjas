import java.util.Scanner;
public class AllPrimeNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	    boolean isPrime = true;

	      for (int i = 2; i < n; i++) {
	         isPrime = true;
	         for (int j = 2; j <= i/2; j++) {
	            if (i%j == 0) {
	               isPrime = false; 
	            }
	         }
	         if (isPrime)
	         System.out.print(" " + i);
	      }	
	      /*
	       Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j;
		for(i=2;i<=n;i++) {
            int c=0;
			for(j=1;j<=i;j++){
                if(i%j==0) {
               c++;
			}
            }
            if(c==2){
                 System.out.println(i);
            }
        }
		
	       */
	}
}
