package Array;
import java.util.Scanner;
public class SwapAlternateInArray {
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void swapAlternate(int arr[]) {
		int n = arr.length;
		if(n%2==0) {
			 for(int i=0;i<arr.length;i+=2) {
	    		    int temp = arr[i];
	    		    arr[i]=arr[i+1];
	    		    arr[i+1]=temp;
	    	  }
		}
		else
		{
			 for(int i=0;i<arr.length-1;i+=2) {
	    		    int temp = arr[i];
	    		    arr[i]=arr[i+1];
	    		    arr[i+1]=temp;
	    	  }
		}
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
		   swapAlternate(a);
			print(a);
			t--;
						
		}

	}

}
