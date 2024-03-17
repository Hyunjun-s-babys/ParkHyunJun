import java.util.Scanner;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        double a = (int)n1+n2;
        double b = (int)n2+n1;
        double c = (int)n1-n2;
        double d = (int)n2-n1;
        double e = (int)n1*n2;
        double f = (int)n1/n2;
        double g = (int)n2/n1;
        double h = Math.pow(n1,n2);
        double i = Math.pow(n2,n1);

        double arr[] = {a,b,c,d,e,f,g,h,i};

        Arrays.sort(arr);
        
        System.out.printf("%.6f",arr[8]);
    }

}
