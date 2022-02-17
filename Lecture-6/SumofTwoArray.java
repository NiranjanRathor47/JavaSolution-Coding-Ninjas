import java.util.Scanner;
public class SumofTwoArray {
	 public static void sumOfTwoArrays(int arr1[], int arr2[], int output[])  {
	    	int i = arr1.length-1;
	        int j = arr2.length-1;
	        int carry = 0;
	        int k = Math.max(arr1.length,arr2.length);  //  k is the current index output array
	        
	        while(i>=0 && j>=0){
	            int sum = arr1[i] + arr2[j] + carry ;
	            output[k] = sum%10;
	            carry = sum/10;
	            
	            i -= 1;
	            j -= 1;
	            k -= 1;
	        }
	        while(i>=0){
	           int sum = arr1[i] + carry ;
	            output[k] = sum%10;
	            carry = sum /10;
	            
	            i -= 1;
	            k -= 1;
	        }
	        while(j>=0){
		           int sum = arr2[j] + carry ;
		            output[k] = sum%10;
		            carry = sum /10;
		            
		            j -= 1;
		            k -= 1;
		        }
	       output[0] = carry ;   
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
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int t = s.nextInt(); 
	while(t>0) {
		int a[] = takeinput();
		int b[] = takeinput();
		int ans[] = {} ;
		sumOfTwoArrays(a,b,ans);
		print(ans);
		t--;
	}
}
}
