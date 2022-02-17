package WhileLoop;
import java.util.Scanner;
public class FahToCelsius {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int rem = 0;
int sumeven =0 , sumodd =0 ;
while(n!=0){
    rem = n%10;
    if(rem%2==0){
        sumeven += rem;
    }
    else
    {
        sumodd +=rem;
    }
    n=n/10;
}
System.out.println(sumeven+ " " +sumodd);
}
}
