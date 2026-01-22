import java.util.Scanner;

public class EIUCUBES2 {
    static Scanner sc = new Scanner(System.in);
    // public static void main(String[] args) {
    //     int n = sc.nextInt();
    //     Long[] arr = new Long[n];
    //     for (int i = 0; i < n; i++){
    //         arr[i] = sc.nextLong();
    //     }
    //     for (int i = 0; i < arr.length;i++){
    //        long heigh =(long) Math.cbrt((double)arr[i]*6); 
    //        if(arr[i] < (heigh*(heigh+1)*(heigh+2))/6){
    //         heigh--;
    //        }
    //        System.out.print(heigh+" ");
    //     }
        
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            int heigh = 0;
            int tempHeigh =(int) Math.cbrt((double)arr[i]*6);
            heigh += tempHeigh;
            if(arr[i] < (heigh*(heigh+1)*(heigh+2))/6){
                heigh --;
            }
            System.out.print(heigh+" ");
        }
        
    }
}
