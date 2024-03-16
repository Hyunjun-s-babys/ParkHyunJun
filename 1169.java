import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a =sc.nextInt();
        int year = 2013-a;

        System.out.print((int)(year%100)+" ");

        System.out.println(year<2000?1:3);
    }

}
