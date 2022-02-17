package String;

public class IntroOrSubString {

	public static void print(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		char c = 'n';
		String str = "Niranjan";
		System.out.println(c);
		System.out.println(str);
		System.out.println(str.charAt(4));
		System.out.println(str.substring(0,8));
		System.out.println(str.length());
		System.out.println(str.substring(1));
//		String temp = str.substring(str.length()+1);
//  	System.out.println(temp);
		System.out.println(str.contains("jan"));
		System.out.println(str.contains("ana"));
		print(str);
	}

}
