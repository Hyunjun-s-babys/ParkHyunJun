import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        int count = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int h = sc.nextInt();
            arr.add(h);
        }
        Collections.sort(arr);
        
        for(int j=0; j<n; j++){
            System.out.print(arr.get(j)+" ");
            count ++;

            if(count==c){
                System.out.println(" ");
                count =0;
            }
        }
    }
}
