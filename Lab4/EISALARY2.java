import java.text.DecimalFormat;
import java.util.Scanner;

public class EISALARY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int soTestCase = sc.nextInt();
        double tongHanhChinh = 0;
        double tongGioHanhChinh = 0;
        double tongTangCa = 0;
        double tongGioTangCa = 0;
        for (int s = 0; s < soTestCase; s++) {
            int doDaiMang = 6;
            double[]arr = new double[doDaiMang];
            for (int i = 0; i < doDaiMang; i++) {
                arr[i] = sc.nextDouble();
            }

            double hanhChinh = 0;
            double tangCa = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > 8) {
                    hanhChinh += 8;
                    tangCa += arr[i] - 8;
                } else {
                    hanhChinh += arr[i];
                }
            }
            double tinhHanhChinh = hanhChinh*arr[arr.length - 1];
            tongHanhChinh += tinhHanhChinh;
            tongGioHanhChinh += hanhChinh;
            double tinhTangCa = tangCa*arr[arr.length - 1]*1.5;
            tongTangCa += tinhTangCa;
            tongGioTangCa += tangCa;
            System.out.println(df.format(tinhHanhChinh + tinhTangCa));
        }
        if (tongGioHanhChinh > 0) {
            System.out.printf("%.2f\n", tongHanhChinh/tongGioHanhChinh);
        } else {
            System.out.println(0);
        }

        if (tongGioTangCa > 0) {
            System.out.printf("%.2f\n", tongTangCa/tongGioTangCa);
        } else {
            System.out.println(0);
        }
    }
}