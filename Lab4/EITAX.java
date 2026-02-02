import java.util.Scanner;

public class EITAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tien = sc.nextLong();
        long luong = tien - 9000000;
        if (luong <= 0) {
            System.out.println(0);
            return;
        }
        long[]gioiHan = {5000000, 10000000, 18000000, 32000000, 52000000, 80000000, Long.MAX_VALUE};
        double[]giam = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35};

        long truoc = 0;
        double tong = 0;
        for (int i = 0; i < gioiHan.length; i++) {
            if (luong > gioiHan[i]) {
                long hienTai = gioiHan[i] - truoc;
                tong += hienTai * giam[i];
                truoc = gioiHan[i];
            } else {
                long hienTai = luong - truoc;
                tong += hienTai * giam[i];
                break;
            }
        }
        System.out.println(Math.round(tong));
    }
    
}