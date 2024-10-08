import java.util.Scanner;

public class HinhChuNhat extends Hinh {
    private double A;
    private double B;
    public double getA()
    {
        return this.A;
    }

    public double getB() {
        return this.B;
    }
    public void setA( double a)
    {
        this.A=a;
    }
    public void setB(double b)
    {
        this.B=b;
    }
    public HinhChuNhat(){
        super();
    }
    public HinhChuNhat(String th, double a, double b)
    {
        super(th);
        this.A=a;
        this.B=b;
    }
    public double ChuVi()
    {
        return ((this.A+this.B)*2.0);
    }
    public double DienTich()
    {
        return (this.A*this.B);
    }
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap vao hai canh Hinh chu nhat: ");
        Scanner sc=new Scanner(System.in);
        this.A= sc.nextInt();
        this.B= sc.nextInt();
    }
    public void Xuat()
    {
        super.Xuat();
        System.out.println("Chieu dai a= "+this.A);
        System.out.println("Chieu rong b= "+this.B);
        System.out.println("Chu vi hinh chu nhat la: "+ChuVi());
        System.out.println("dien tich hinh chu nhat la: "+DienTich());

    }
}
