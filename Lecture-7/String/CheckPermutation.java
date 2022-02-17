package String;
import java.util.Arrays;
import java.util.Scanner;
public class CheckPermutation {
	public static boolean isPermutation(String str1, String str2) {
	    if (str1.length() != str2.length())
	    return false;
	    
	    char ch1[] = str1.toCharArray();
	    char ch2[] = str2.toCharArray();   // Converts this string to a new character array.
	 
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	
	    for (int i = 0; i <str1.length(); i++)
	    if (ch1[i] != ch2[i])
	        return false;
	 
	    return true;
	}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			String str1 = s.nextLine(); 
			String str2 = s.nextLine();
			  boolean ans = isPermutation(str1,str2);
			System.out.println(ans);
	}
}
