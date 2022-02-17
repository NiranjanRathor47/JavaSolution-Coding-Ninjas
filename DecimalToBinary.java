import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rem ;
	    long result=0,i=1 ;
		
		while(n>0){
            rem =n%2;
            result+=rem*i;
            i*=10;
            n=n/2;
        }
		System.out.print(result);
	}
}
