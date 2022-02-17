import java.util.Scanner;
public class SumOrProduct {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int c = s.nextInt();
        int sum =0,prt=1;
        if(c==1){
            for(int i=1;i<=n;i++){
                sum=sum+i;
            }
            System.out.print(sum);
        }
        else if(c==2){
            for(int i=2;i<=n;i++){
                prt = prt*i;
                
            }
            System.out.print(prt);
        }
        else
        {
            System.out.print(-1);
        }

	}
}
