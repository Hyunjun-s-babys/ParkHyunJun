import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int time =sc.nextInt();
        int goal1 =sc.nextInt();
        int goal2 = (90-time)/5;

        if(time%5==0){
            System.out.println(goal1+goal2);
        }else{
            System.out.println(goal1+goal2+1);
        }

    }

}
