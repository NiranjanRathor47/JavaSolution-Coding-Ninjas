package String;
import java.util.Scanner;
public class RemoveCharacter {
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		char ch1[] = str.toCharArray();
		int count = 0 ;
	char[] ret = new char[100];
		for (int i = 0; i <str.length(); i++) {
			int j=0;
		    if (ch1[i]!= ch) {
		   System.out.print(ch1[i]);
		    }
		}
		String at = String.valueOf(ret);     // a String that contains the characters of the character array.
		
		return at ;
	}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 String str1 = s.nextLine(); 
		 char c = s.next().charAt(0);   
		 removeAllOccurrencesOfChar(str1,c);
	}
}
