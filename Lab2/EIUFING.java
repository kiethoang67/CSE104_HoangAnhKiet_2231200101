import java.util.Scanner;

public class EIUFING {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long n = sc.nextLong();
        String[] banTay = {"trai", "phai"};
        long result = n%18;
        if(result > 10){
            result = 20 -result;
        }
        String ngontay="";
        String bantay ="";
        if(result > 5){
            result = 11 - result;
            bantay = banTay[1];
        }else{
            bantay = banTay[0];
        }
        if (result == 0 || result == 2) {
            ngontay = "tro";
        }
        if (result ==1) {
            ngontay ="cai";
        }
        if (result == 3){
            ngontay = "giua";
        }
        if (result == 4) {
            ngontay ="ap ut";
        }
        if (result == 5) {
            ngontay ="ut";
        }
        System.out.println("Ngon "+ngontay+" "+"cua ban tay "+bantay);
    }
    
    
}
