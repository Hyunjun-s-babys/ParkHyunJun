import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int bonusCount = 0;

        int arr[] = new int[7];

        for(int i=0; i<7; i++){
            arr[i] = sc.nextInt();
        }

        for(int j=0; j<6; j++){
            int a=sc.nextInt();
            for(int k=0; k<6; k++){
                if(arr[k]==a){
                    count+=1;
                }else{
                    count+=0;
                }
            }
            bonusCount=arr[6]==a?bonusCount+1:bonusCount;
        }
        System.out.println(count==6?"1":count==5&&bonusCount==1?"2":count==5?"3":count==4?"4":count==3?"5":"0");
    }
}

    
