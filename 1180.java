import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = n/10;
        int c = n%10;
        int d = c*10+b;
        int e = d*2;

        if(e<=50){
            System.out.printf("%d\nGOOD",e);
        }
        else if(e>=100){
            if(e-100<=50){
                System.out.printf("%d\nGOOD",e);
            }else{
                System.out.printf("%d\nOH MY GOD",e);
            }
        }
        else{
            System.out.printf("%d\nOH MY GOD",e);
        }
    }

}
