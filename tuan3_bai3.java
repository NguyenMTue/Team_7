import java.util.Scanner;

public class tuan3_bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap vao a: ");
        double a= sc.nextDouble();
        System.out.print("nhap vao b: ");
        double b= sc.nextDouble();
        System.out.print("nhap vao c: ");
        double c= sc.nextDouble();
        double delta= Math.pow(b,2) - (4*a*c);
        if (delta<0)
            System.out.println("PT vo nghiem");
        else if (delta==0)
        {
            double x= -b/(2*a);
            System.out.println("PT co nghiem kep x= "+x);
        }
        else {
            double x1=(-b+Math.sqrt(delta))/(2*a);
            double x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("PT co 2 nghiem phan biet:\n x1 = "+x1+"\n x2 = "+x2);
        }
    }
}
