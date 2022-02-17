package String;
import java.util.Scanner;
public class CountWords {

public static int countWords(String str) {	
		int count= 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' '|| str.charAt(i) == '\n' || str.charAt(i) == '\t') {
				count++;
			}
		}
		  if (str == null || str.isEmpty()) {
	            return 0;}
		return count+1;
	}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			String str = s.nextLine(); 
			int res = countWords(str);
			System.out.println(res);
	}
}
