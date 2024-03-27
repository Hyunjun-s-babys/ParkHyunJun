import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int dice = sc.nextInt();
        int temp = 0;

        for(int i=1; i<7; i++){
            if(dice-i>0&&dice-i<7){
                System.out.printf("%d %d\n",i, dice-i);
            }
        }
    }
}
