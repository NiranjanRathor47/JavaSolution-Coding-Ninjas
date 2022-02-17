import java.util.Scanner;
public class TermsOfAP {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,p,count=0;
		for(i=1;count<n;i++) {
			p = 3*i+2;
			if(p%4!=0) {
				System.out.print(p+" ");
                 count++;
			}
		}
	}
}
