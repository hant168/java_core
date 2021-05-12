import java.util.Scanner;

public class NgayThangNam {
    public int thang;
    public int nam;

    public void tinhNgayThangNam(){

       switch(thang){
           case 1,3,5,7,8,10,12: 
           System.out.println("Thang "+ thang+ "co 31 ngay");
           break;
           case 4,6,9,11:
           System.out.println("Thang "+ thang+ "co 30 ngay");
           break;
           case 2:
                //int nam;
                Scanner m= new Scanner(System.in);
                System.out.print("Moi nhap nam:");
                nam = m.nextInt();
                if((nam%4==0) && (nam%100!=0)||(nam%400==0)){
                    System.out.println("thang"+thang+" co 29 ngay");
                    }
                 else System.out.println("thang"+thang+" co 28 ngay");
                 break;

            default:{System.out.println("Nhap thang khong hop le");

           }

       }

   }
   
}
