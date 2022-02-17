import java.util.Scanner;
public class ScannerInClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int i =s.nextInt();
//		int j =s.nextInt();
//		
//		int k = i+ j;
//		System.out.println(k);
		String str = s.next();
		System.out.println(str);
		
		long l = s.nextLong();
		double d = s.nextDouble();
		float f = s.nextFloat();
	}
}
