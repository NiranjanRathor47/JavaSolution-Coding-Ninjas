import java.util.Scanner;
public class PushZerosToEnd {

	public static void pushZerosAtEnd(int[] arr) {
		int count =0;
		for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
		 while (count < arr.length) {
	            arr[count++] = 0;}
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
				pushZerosAtEnd(a);
				print(a);
				t--;		
			}
	}

}
