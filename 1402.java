import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n1; i++){
            int n2 = sc.nextInt();
            arr.add(n2);
        }for(int j=n1-1; j>-1; j--){
            System.out.print(arr.get(j)+" ");
        }
    }
}
