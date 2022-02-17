package Pattern;
import java.util.Scanner;
public class Pattern4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		//int val  =1;
		while(i<=n) {
			int j = 1;
			while(j<=i) {
				System.out.print(i+j-1);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
