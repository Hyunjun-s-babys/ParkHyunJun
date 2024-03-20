import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int n = sc.nextInt();
        int res=a;

        for(int i=1; i<=n-1; i++){
            if(n==1){
                System.out.println(res);
            }else{
                res=res*b+c;
            }
            
        }System.out.println(res);
    }
}
