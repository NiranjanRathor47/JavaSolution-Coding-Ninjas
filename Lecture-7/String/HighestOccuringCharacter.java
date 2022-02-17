package String;
import java.util.Scanner;
public class HighestOccuringCharacter {
	public static char highestOccuringChar(String str) {
		int count[] = new int [256];
		char res = ' ';
		int max = -1;
		for(int i =0;i<str.length();i++) {
			count[str.charAt(i)]++;
			}
		for(int i =0;i<str.length();i++) {
			if(max<count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				res = str.charAt(i);
			}
		}
	return res ;
	}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			String str = s.nextLine();
		   char ans = highestOccuringChar(str);
		   System.out.print(ans);
	}
}
