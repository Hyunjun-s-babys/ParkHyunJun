import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = 0;

        int[] cal = {400,340,170,100,70};

        result += cal[a-1];
        result += cal[b-1];

        if(result>500){
            System.out.println("angry");
        }else{
            System.out.println("no angry");
        }
    }
}
