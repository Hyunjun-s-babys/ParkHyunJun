import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a =sc.nextDouble();

        if(50<=a&&a<=70){
            System.out.println("win");
        }
        else if(a%6==0){
            System.out.println("win");
        }
        else{
            System.out.println("lose");
        }

    }
}
