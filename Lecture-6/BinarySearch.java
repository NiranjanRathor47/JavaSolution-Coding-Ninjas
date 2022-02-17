import java.util.Scanner;
public class BinarySearch {
      
	public static int binarySearch(int[] arr, int x) {
		int start =0;
		int end = arr.length - 1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(x==arr[mid]) {
				return mid;
			}
			else if(x>arr[mid]) {
				start = mid+1;
			}
			else {
				end = mid-1;
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
			int a[] = takeinput();
			int t = s.nextInt(); 
			while(t>0) {
				int l = s.nextInt(); 
				int index = binarySearch(a ,l);
				System.out.print(index);
				t--;		
			}
	}

}
