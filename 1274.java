import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int temp = 0;

        for(int i=2; i<a; i++){
            if(a%i==0){
                temp =1;
            }
        }
        
        if(temp==1){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
}
