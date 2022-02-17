package Sort;
import java.util.Scanner;
public class Sort012 {
	 public static void sort012(int[] arr){
		   int Count = 0 , Count1 = 0;
	         for (int i = 0; i < arr.length; i++) {
	              if (arr[i] == 0)
	                 Count++;
	              if (arr[i] == 1)
	                   Count1++;
	        }
	        for (int i = 0; i < Count; i++) {
	            arr[i] = 0;
	        }
	       for (int i = Count; i < (Count + Count1); i++) {
	            arr[i] = 1;
	       }
	      for (int i = (Count + Count1); i < arr.length; i++) {
	            arr[i] = 2;
	      }
	    }
	 public static void print(int arr[]) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
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
	public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
			int t = s.nextInt(); 
			while(t>0) {
				int a[] = takeinput();
				sort012(a);
				print(a);
				t--;	
				
			}
	}
}
