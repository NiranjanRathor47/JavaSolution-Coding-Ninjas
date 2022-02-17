package Array;
import java.util.Scanner;
public class LinearSearchByFun {
	 public static int linearSearch(int arr[], int x) {
		 for(int i=0;i<arr.length;i++) {
				if(arr[i]==x) {
					 return i;
				}
			}
		 return -1;
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
				int l = s.nextInt(); 
				t--;
				int result = linearSearch(a,l);
				System.out.println(result);
				
			}
		}
    
}
