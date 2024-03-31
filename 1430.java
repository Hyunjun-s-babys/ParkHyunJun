import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            arr1.add(a);
        }

        ArrayList<Integer> arr2 = new ArrayList<>();

        int m = sc.nextInt();

        for(int j=0; j<m; j++){
            int b = sc.nextInt();
            arr2.add(b);
        }

        for(int k=0; k<m; k++){           
            for(int g=0; g<n; g++){
                if(arr2.get(k).equals(arr1.get(g))){
                    count++;
                    break;
                }
            }
            if(count == 1){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
            count = 0;
        }
    }
}
