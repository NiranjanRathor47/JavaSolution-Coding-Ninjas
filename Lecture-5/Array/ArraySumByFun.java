package Array;
import java.util.Scanner;
public class ArraySumByFun {

	public static int sum(int[] arr) {
		int sum =0;
			for(int i=0;i<arr.length;i++) {
				sum += arr[i];
			}
			return sum ;
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
	      Scanner s = new Scanner(System.in);
			int t = s.nextInt(); 
			while(t>0) {
				int a[] = takeinput();
				print(a);
	            int result = sum(a);
				System.out.println(result);
				t--;
			}
		}
}
