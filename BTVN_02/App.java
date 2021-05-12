
import java.util.Scanner;

public class App {

   public static void main(String[] args) throws Exception {
      // Caculator calcu=new Caculator();
      // calcu.sum();
      // calcu.tru();
      // System.out.println(calcu.chia());

      // Rectangle rec = new Rectangle();
      // rec.chuvi();
      // rec.dientich();

      // Circle cir = new Circle();
      // cir.tinhChuVi();
      // cir.tinhDienTich();

      /*
       * PTBN ptbn = new PTBN(); Scanner sc = new Scanner(System.in);
       * System.out.print("Nhap a:"); ptbn.a = sc.nextInt();
       * System.out.print("Nhap b:"); ptbn.b = sc.nextInt(); ptbn.tinhPTBN();
       */
      // in ra số ngày của tháng

      NgayThangNam ntn = new NgayThangNam();
      Scanner sc = new Scanner(System.in);
      System.out.print("Nhap thang:");
      ntn.thang = sc.nextInt();
      ntn.tinhNgayThangNam();

      /*
       * NgayThangNam_1 ntn1 = new NgayThangNam_1(); ntn1.tinhNgayThangNam();
       */
      // tinh PTBH
      /*
       * PTBH ptbh = new PTBH(); Scanner sc = new Scanner(System.in);
       * System.out.print("Nhap a="); ptbh.a = sc.nextInt();
       * System.out.print("Nhap b="); ptbh.b = sc.nextInt();
       * System.out.print("Nhap c="); ptbh.c = sc.nextInt(); ptbh.tinhPTBH();
       */
   }

}
