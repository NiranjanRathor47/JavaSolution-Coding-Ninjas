package Array;
import java.util.Scanner;
public class ArrayIntersection {
      public static void intersections(int arr1[], int arr2[]) {
    	   int i,j,temp=0;
    	   for(i=0;i<arr1.length;i++) {
    		   for(j=0;j<arr2.length;j++) {
    			   if(arr1[i]==arr2[j]) {
    				   System.out.print(arr1[i]+ " ");
    				   arr2[j]=temp;
    				   break ;
    			   }
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
				int b[] = takeinput();
				intersections(a,b);
				t--;					
			}
		}
}
