import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a =sc.nextInt();
        int b = sc.nextInt();

        System.out.println(b<3?100-(int)(a/10000)+13:13-(int)(a/10000));

       
    }

}
