package Function;
import java.util.Scanner;
public class FahToCelByFunction {
	public static void printFahrenheitTable(int start, int end, int step) {
		int fahval = start ;
        while(fahval<=end){
            int celval = (int)((5.0/9)*(fahval-32));
            System.out.println(fahval + " " + celval);
            fahval += step;
        }
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int i =s.nextInt();
		int j =s.nextInt();
		int k =s.nextInt();   
    
		printFahrenheitTable(i,j,k);
}
}
