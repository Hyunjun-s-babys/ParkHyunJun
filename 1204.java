import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();

        
        
        System.out.println(a%10==1?a==11?a+"th":a+"st":a%10==2?a==12?a+"th":a+"nd":a%10==3?a==13?a+"th":a+"rd":a+"th");
    }

}
