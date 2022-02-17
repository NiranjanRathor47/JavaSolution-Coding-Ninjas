import java.util.Scanner;
public class CheckArmstrong {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int orgNum = n;
		   int num = 0;
		   int  SumOfSquar = 0;
		
		   while(n != 0 ) {
			   num++;
			   n = n/10;
		   }
		    n=orgNum;
		    while(n != 0) {
		    	int temp = n%10;
		    	SumOfSquar += (int)Math.pow(temp, num);
		    	
		    	n/=10;
		    }
		 
		   
		   if(orgNum == SumOfSquar) {
			   System.out.println("true");
		   }
		   else {
			   System.out.println("false");
		   }
	}
}
