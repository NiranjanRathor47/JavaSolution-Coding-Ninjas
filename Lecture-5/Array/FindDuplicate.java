package Array;
import java.util.Scanner;
public class FindDuplicate {
      
	public static int duplicateNumber(int arr[]) {
		 for(int i=0;i<arr.length;i++) {
	    			for(int j=0;j<arr.length;j++){
                       if(i==j){
                           continue;
                       }
                       if(arr[i]==arr[j]){
                           return arr[i];
                       }
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
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt(); 
		while(t>0) {
			int a[] = takeinput();
		    int ans = duplicateNumber(a);
		    System.out.println(ans);
			t--;
	}
	}
}
