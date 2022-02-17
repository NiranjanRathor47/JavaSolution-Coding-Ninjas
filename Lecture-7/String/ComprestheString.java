package String;
import java.util.Scanner;
public class ComprestheString {
	public static String getCompressedString(String str) {
        String s = str.charAt(0) + "";
        int count = 1;
        for(int i = 1; i < str.length(); i++){
            char current = str.charAt(i);
            char previous = str.charAt(i-1);
            if(current == previous){
                count++;
            }
            else{
                if(count > 1){
                    s +=count;
                    count = 1;
                }
                s += current;
            }
        }
        if(count > 1){
            s += count;
            count =1;
        }
        return s;
	}

	public static void main(String[] args) {
			 Scanner s = new Scanner(System.in);
				String str = s.nextLine();
			   String res = getCompressedString(str);
			   System.out.println(res);
		}

	}
