package Array;
import java.util.Scanner;
public class TripletSum {
	 public static int findTriplet(int[] arr, int x) {
	    	int i,j,k,count =0;
	    	for(i=0;i<arr.length;i++) {
	    		for(j=i+1;j<arr.length;j++) {
	    			for(k=j+1;k<arr.length;k++) {
	    				if(arr[i]+arr[j]+arr[k]==x) {
	    					count++;
	    				}
	    			}
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
				int result = findTriplet(a,l);
				System.out.println(result);
			}
		}
}
