import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> list = new ArrayList<>();

        int k = sc.nextInt();
        int h = sc.nextInt();

        int n = k>h?k:h;
        int count = 0;
        int result = 0;

        for(int i=1; i<=n; i++){
            if(i%2!=0){
                count++;
            }
            if(i==k||i==h){
                if(i%2!=0){
                    result += count;
                }else{
                    result += count*10;
                }
            }
        }
        System.out.println(result);
        
    }
 }
