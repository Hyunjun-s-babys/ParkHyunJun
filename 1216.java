import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = b-c;

        if(result>a){
            System.out.println("advertise");
        }else if(result<a){
            System.out.println("do not advertise");
        }else{
            System.out.println("does not matter");
        }


    }

}
