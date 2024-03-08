import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int x =sc.nextInt();
        int c = a<<x;

        System.out.println(c);

        // 3 0000 0011
        // <<3 0000 0110, 1100, 0001 1000= 16+8=24 

    }
}
