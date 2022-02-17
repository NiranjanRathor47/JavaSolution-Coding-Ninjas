package Sort;
import java.util.Scanner;
public class SecondLargestArray {

	 public static int secondLargestElement(int[] arr) {
		 int i, first, second; 
	        if (arr.length < 2) 
	        { 
	            return -2147483648;
	        }    
	        first = second = Integer.MIN_VALUE; 
	        for (i = 0; i < arr.length ; i++) 
	        { 
	        	if (arr[i] > first) 
	            { 
	                second = first; 
	                first = arr[i]; 
	            } 
	 	            else if (arr[i] > second && arr[i] != first) 
	                second = arr[i]; 
	        }  
	        if (second == Integer.MIN_VALUE) 
	        { return -2147483648;}
	        return second ;
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
					int res = secondLargestElement(a);
					System.out.println(res);
					t--;		
				}
		} 
}
