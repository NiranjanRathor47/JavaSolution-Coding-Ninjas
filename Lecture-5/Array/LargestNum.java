package Array;
import java.util.Scanner;
public class LargestNum {

	public static int largestnum (int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); 
		int arr[]= new int [n];
		for(int i=0;i<n;i++) {
			arr[i]= s.nextInt();
		}
		return arr;
	}
	public static void print(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int a[] = takeinput();
		print(a);
		int result = largestnum(a);
		System.out.println("Greast = " + result);

	}
}
