import java.util.Scanner;

public class NgayThangNam {
    public int thang;
    public int nam;

    public void tinhNgayThangNam() {

        System.out.print("test test test , ti xoa sau");

        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Thang " + thang + "co 31 ngay");
                break;
            case 4, 6, 9, 11:
                System.out.println("Thang " + thang + "co 30 ngay");
                break;
            case 2:
                Scanner m = new Scanner(System.in);
                System.out.print("Moi nhap nam:");
                nam = m.nextInt();
                if ((nam % 4 == 0)) {
                    if (nam % 100 == 0) {
                        if (nam % 400 == 0) {
                            System.out.println("Tháng" + thang + "có 29 ngày");
                        }
                    } else {
                        System.out.println("Tháng" + thang + "có 28 ngày");
                    }
                }
                break;
            default: {
                System.out.println("Nhap thang khong hop le");
            }

        }

    }

}
