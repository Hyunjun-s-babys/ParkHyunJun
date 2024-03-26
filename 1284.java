import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=2; i<num; i++){
            if(num%i==0){
                for(int j=2; j<i; j++){
                    if(i%j==0){
                        temp++;
                        break;
                    }else{
                        temp=0;
                    }
                }if(temp==0){
                    arr.add(i);
                }
            }
        }
        if(arr.size()==2&&arr.get(0)*arr.get(1)==num){
            System.out.printf("%d %d", arr.get(0),arr.get(1));
        }else{
            System.out.println("wrong number");
        }
        
    }
}
