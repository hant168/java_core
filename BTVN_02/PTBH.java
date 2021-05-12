public class PTBH {
    public double a, b, c;

    public void tinhPTBH() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }

            } else {
                System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + -c / b);
            }
        } else {
            double delta = ((Math.pow(b, 2)) - (4 * a * c));

            if (delta > 0) {
                double x1 = -b + (Math.sqrt(delta)) / 2 * a;
                double x2 = -b - (Math.sqrt(delta)) / 2 * a;
                System.out.print("Phương trình có 2 nghiệm phân biệt: x1=" + x1 + "và x2=" + x2);
            } else {
                if (delta == 0) {
                    double x1 = -b / 2 * a;
                    System.out.print("Phương trình có nghiệm kép: x1=x2" + x1);
                }
                System.out.println("Phương trình có vô số nghiệm");

            }

        }
    }

}