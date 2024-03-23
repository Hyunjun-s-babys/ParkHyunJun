import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result= 0;

        for(int i=a; i<=b; i++){
            if(a%2==0){
                if(i%2==0){
                    result-=i;
                    System.out.print(-i);
                }else{
                    result+=i;
                    if(i==a){
                        System.out.print(i);
                    }else{
                        System.out.print("+"+i);
                    }
                    
                }
                
            }else{
                if(i%2==0){
                    result-=i;
                    System.out.print(-i);
                }else{
                    result+=i;
                    if(i==a){
                        System.out.print(i);
                    }else{
                        System.out.print("+"+i);
                    }   
                }
            }
        }
        System.out.println("="+result);
        
    }
 }
