import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        int arr[] = {a,b,c};

        Arrays.sort(arr);

        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }

}
