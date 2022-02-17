package Array;
import java.util.Scanner;
public class sort01 {
	public static void sortZeroesAndOne(int[] arr) {
		 int count = 0; 	     
	     for (int i = 0; i <arr.length; i++) {
	         if (arr[i] == 0)
	             count++;
	        }
	     for (int i = 0; i < count; i++) {
	            arr[i] = 0;
	     }
	     for (int i = count; i <arr.length; i++) {
	            arr[i] = 1;
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
			sortZeroesAndOne(a);
			print(a);
			t--;	
			
		}
	}

	 
}
