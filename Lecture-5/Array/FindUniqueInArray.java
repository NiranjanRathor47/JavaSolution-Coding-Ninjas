package Array;
import java.util.Scanner;
public class FindUniqueInArray {

	public static int findUnique(int[] arr){
		int res = arr[0];
		for(int i=1;i<arr.length;i++) {
			 res = res ^ arr[i];
		}
		return res;
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
		    int ans = findUnique(a);
		    System.out.println(ans);
			t--;
	}
	}
}
