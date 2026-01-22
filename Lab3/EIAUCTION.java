
import java.util.Scanner;

public class EIAUCTION {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {    
        int n = sc.nextInt();
        int[] arr = new int[7];
        int[] index = new int[7];
        for (int i = 0; i < n ; i++){
            int num = sc.nextInt();
            arr[num] ++;
            index[num] = i;
        }
        for (int i = 6; i > 0; i--){
            if (arr[i] == 1) {
                System.out.println(index[i]+1);
                return;
            }
        }
        System.out.println("none");
        

    }
            
}
