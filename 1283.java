import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double result = 0;
        double temp = 0;
        double d = 0;

        for(int i=1; i<=b; i++){
            int c = sc.nextInt();
            
            if(i>=2){
                temp = result*(0.01*c);
                result = result+temp;
            }else{
                temp = a*(0.01*c);
                result = a+temp;
            }
        }
        d = result-a;

        System.out.println(Math.round(d));

        if(d>0){
            System.out.println("good");
        }else if(d==0){
            System.out.println("same");
        }else{
            System.out.println("bad");
        }
    }
}
