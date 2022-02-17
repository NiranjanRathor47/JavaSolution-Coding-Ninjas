package Pattern;
import java.util.Scanner;
public class DiamondOfStarsPattern {

	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
			int n = s.nextInt();
	        int n1=(n+1)/2;
	        int n2=n/2;
			int i=1;
			while(i<=n1) {
				int space =1;
				while(space<=n1-i) {
					System.out.print(" ");
					space++;		
				}
				int j=1;	
				while(j<=(2*i)-1) {
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
			}
			 i=n2;
				while(i>=1) {
					int space =1;
					while(space<=(n2-i+1)) {
					System.out.print(" ");
					space++;		
				}
				int j=1;
				while(j<=(2*i)-1) {
					System.out.print("*");
					j++;
				}
				System.out.println();
					i--;	
		}
		
}	
	}


