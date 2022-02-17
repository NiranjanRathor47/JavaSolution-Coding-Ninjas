import java.util.Scanner;
public class CheckNumberSequence {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];   
		for(int i=0; i<n; i++)  
		{
		arr[i]=s.nextInt();  
		}  
		 int comparearr[] = new int[n-1];
		    for(int j=0;j<n-1;j++)
		    {
		     comparearr[j]=arr[j]-arr[j+1];   
		    }
		    int count=0;
		    for(int k=0;k<n-2;k++)
		    {
		       if((comparearr[k]>0 && comparearr[k+1]<0)||(comparearr[k]<0 && comparearr[k+1]>0))
		       {
		           count++;
		       }
		    }
		    if(count>=2)
		    {
		    	System.out.print("false");
		    }
		    else
		    {
		    	System.out.print("true");
		    }
		
		}
}
