import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a =sc.nextDouble();

        if(30<=a&&a<=40){
            System.out.println("win");
        }
        else if(60<=a&&a<=70){
            System.out.println("win");
        }
        else{
            System.out.println("lose");
        }

    }
}
