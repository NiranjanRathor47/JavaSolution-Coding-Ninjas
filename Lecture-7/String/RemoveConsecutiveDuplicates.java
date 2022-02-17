package String;
import java.util.Scanner;
public class RemoveConsecutiveDuplicates {
	  public static String removeConsecutiveDuplicates(String str) {
	        if(str.length()==0) {
	   			return str;
	   		}
	        String ans = "";
		    int start =0;
	        while(start < str.length()){
	            char chter = str.charAt(start);
	            int nextchter = start + 1 ;
	        while(nextchter<str.length() && str.charAt(nextchter) == chter){
	            nextchter += 1 ;
	        }
	            ans += chter ;
	            start = nextchter ;
	        }
	        return ans ;
		}
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String str = s.nextLine(); 
			 String ans = removeConsecutiveDuplicates(str);
			 System.out.println(ans);
		}
}
