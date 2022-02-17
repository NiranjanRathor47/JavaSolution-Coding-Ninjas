package String;
import java.util.Scanner;
public class ReverseEachWord {
	public static String reverseEachWord(String str) {
		String[] words = str.split(" ");
	String reversedString = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--){
		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	}
	return  reversedString ;
	}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			String str = s.nextLine();
		   String ans = reverseEachWord(str);
		   System.out.println(ans);
		   
	}
}
