package Sort;

public class AscendingSelectionSort {
	public static void selectionsort (int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min = arr[i];
			int minindex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minindex=j;
				}
			}
			if(minindex!=i) {
				arr[minindex]=arr[i];
				arr[i]=min;
			}
		}
	}
	
	public static void main(String[] args) {
          int a[]= {2,6,9,1,5};
          selectionsort(a);
          for(int i=0;i<a.length;i++) {
        	  System.out.print(a[i]+" ");
          }
	}

}
