package Function;
import java.util.Scanner;
public class MemberOfFibonacciByFun {
	   static  boolean isPerfectSquare(int x)
	    {
	        int s = (int) Math.sqrt(x);
	        return (s*s == x);
	    }
	
	public static boolean checkMember(int n){
				 return isPerfectSquare(5*n*n + 4) ||
	               isPerfectSquare(5*n*n - 4);
	}
public static void main(String[] args) {
 		Scanner s = new Scanner(System.in); 
 		int p =s.nextInt();
 		
 		boolean res = checkMember(p);
 		System.out.println(res);  
 }
	
}
