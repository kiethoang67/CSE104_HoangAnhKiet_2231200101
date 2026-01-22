import java.util.Scanner;

public class EIUCUBES {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        int brick = 0;
        for (int i = 1 ; i <= n; i++){
            int brickOfFloor = (i * (i + 1))/2;
            brick += brickOfFloor;
            if (brick > n){
                sb.append(i-1);
                break;
            }

        }
        
        if(n==1){
            System.out.println(1);
        }else{
            System.out.println(sb);
        }
    }
}
