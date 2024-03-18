import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int time = sc.nextInt();
        int goal1 = sc.nextInt();
        int goal2 = sc.nextInt();
        int goal = (90-time)/5;
        

        if(time%5==0){
            int s = goal1+goal;
            if(s>goal2){
                System.out.println("win");
            }else if(s==goal2){
                System.out.println("same");
            }else{
                System.out.println("lose");
            }
        
            
        }else{
            int s = goal1+goal+1;
            if(s>goal2){
                System.out.println("win");
            }else if(s==goal2){
                System.out.println("same");
            }else{
                System.out.println("lose");
            }
            System.out.println(goal1+goal2+1);
        }


    }

}
