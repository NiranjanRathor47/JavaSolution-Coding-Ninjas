package Function;
import java.util.Scanner;
public class FindPrimeWithFun {
         public static boolean isprime(int n) {
        	 int d=2;
        	 while(d<n) {
        		 if(n%d==0) {
        			 return false ;
        		 }
        		 d++;
        	 }
        	 return true ;
        	 }
  
//  public static void printTiln(int n) {
//	  if(n<=0) {
//		  return ;
//	  }
//	  for(int i=1;i<=n;i++) {
//		  System.out.println(i);
//	  }
//  }
//          
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 
        
        boolean ansprime  = isprime(n); 
        System.out.println(ansprime);  
        
         }
}
