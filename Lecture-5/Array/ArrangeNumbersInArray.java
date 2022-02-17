package Array;
import java.util.Scanner;
public class ArrangeNumbersInArray {
	  
	 public static void arrange(int[] arr, int n) {
	        int jump =1;
	        for(int i =0; i<(n/2)+(n%2); i++){
	            arr[i] = jump;
	            jump += 2; 
	        }
	        if(n %2 != 0){
	        int back = n-1;
	        for(int i =(n/2)+(n%2); i<n; i++){
	            arr[i] = back;
	            back -= 2;
	        }
	          
	        }
	        else{
	            int back = n;
	            for(int i =(n/2)+(n%2); i<n; i++){
	            arr[i] = back;
	            back -= 2;
	            
	        }
	    }
	}
	 public static void print(int arr[]) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
			int t = s.nextInt(); 
			while(t>0) {
				int n = s.nextInt(); 
				int arr[]= new int [n];
				arrange(arr , n);
				print(arr);
				t--;				
			}
	}
}
