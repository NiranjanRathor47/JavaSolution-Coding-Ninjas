import java.util.Scanner;

public class LogicalOpeartor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int i =s.nextInt();
		int j =s.nextInt();
		int k =s.nextInt();
		
		boolean isLargest = (i>=j) && (i>=k);
		System.out.println(isLargest);
		System.out.println((i>=j) || (i>=k));
		System.out.println(!(i>=j));
		
	}

}
