package Array;
import java.util.Scanner;
public class PairSum {
	 public static int pairSum(int arr[], int x) {
	    	int count =0;
	    	for(int i=0;i<arr.length;i++) {
	    		for(int j=i+1;j<arr.length;j++) {
	    			if ((arr[i] + arr[j]) == x)
	                    count++; 			
	    		}
	    	}
	    	return count;
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
					int l = s.nextInt(); 
					t--;					
					int result = pairSum(a,l);
					System.out.println(result);
				}
			}
}
