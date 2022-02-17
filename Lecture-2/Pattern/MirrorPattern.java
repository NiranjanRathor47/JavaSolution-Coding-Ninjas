package Pattern;
import java.util.Scanner;
public class MirrorPattern {
	public static void main(String[] args) {
	Scanner scr = new Scanner(System.in);
    int n = scr.nextInt();
    int i = 1 ;
    
    while( i<=n ){
        int Start = 1;
        int j =1;
        while( j <= n - i ){
            System.out.print(" ");
          j++;
        }
        while(j<=n){
            System.out.print(Start);
            Start++;
            j++;
        }
        System.out.println();
        i++;
    }
		
}
}
