package String;

public class StringsStored {
	public static void printprefix(String stg) {
		for(int i=0;i<stg.length();i++) {
			System.out.println(stg.substring(0,i+1));
		}
	}

	public static void main(String[] args) {
		char c = 'n';
		String str = "Niranjan";
		str += "def";
		System.out.println(str);
		System.out.println(str.concat("josh"));
		System.out.println(str);
		
		int [] arr = {1,5,3};
//		int [] arr1 = {1,5,3};
		int [] arr1 = arr;
		if(arr==arr1) {
			System.out.println("equal");
		}
		else {
			System.out.println("unequal");
		}
		System.out.println(arr);
		System.out.println(arr1);
		
		String str1 = "abd";
		String str2 = "abd";
		if(str1==str2) {
			System.out.println("equal");
		}
		else {
			System.out.println("unequal");
		}
		
		String stg = "abcde";
		printprefix(stg);
}
}