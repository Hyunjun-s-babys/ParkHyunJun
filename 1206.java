import java.util.Scanner;

// 삼항연산자 어떻게 해야될지 모르겠음


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= b/a;
        int d= a/b;

        if(b%a==0){
            System.out.printf("%d*%d=%d",a,c,b);
        }else if(a%b==0){
            System.out.printf("%d*%d=%d",d,b,a);
        }else{
            System.out.println("none");
        }
        
        
    }

}
