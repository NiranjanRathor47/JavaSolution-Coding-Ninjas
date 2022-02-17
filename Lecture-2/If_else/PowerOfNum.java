package If_else;
import java.util.Scanner;
import java.lang.Math;
public class PowerOfNum {
	 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		int x =s.nextInt();
        int n =s.nextInt();
        double result = Math.pow(x,n);
        int r = (int)(result);
        System.out.println(r);
        
    }
}
