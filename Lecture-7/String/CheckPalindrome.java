package String;
import java.util.Scanner;
public class CheckPalindrome {
	public static boolean isPalindrome(String str) {
		  int i = 0, j = str.length() - 1;
	        while (i < j) {
	            if (str.charAt(i) != str.charAt(j)) {
	                return false;}
	            i++;
	            j--;
	        }
	    return true;
	}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			String str = s.nextLine(); 
			  boolean ans = isPalindrome(str);
			System.out.println(ans);
	}
}
