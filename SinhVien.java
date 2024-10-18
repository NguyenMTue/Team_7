import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class SinhVien implements Comparable<SinhVien> {

    private String MaSV;
    private String ten;
    private Date ngaySinh;
    private double diemTB;
    public String getMaSV()
    {
        return this.MaSV;
    }
    public String getTen()
    {
        return this.ten;
    }
    public Date getNgaySinh()
    {
        return this.ngaySinh;
    }
    public double getDiemTB()
    {
        return this.diemTB;
    }
    public void setMaSV(String ma){
        this.MaSV=ma;
    }
    public void setTen(String t)
    {
        this.ten=t;
    }
    public void setNgaySinh(Date n)
    {
        this.ngaySinh=n;
    }
    public void setDiemTB(double d)
    {
        this.diemTB=d;
    }
    public SinhVien(){}
    public SinhVien(String ma, String t, Date n, double d)
    {
        this.MaSV=ma;
        this.ten=t;
        this.ngaySinh=n;
        this.diemTB=d;
    }
    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
            System.out.print("Ma sv: ");
            this.MaSV = sc.nextLine();
            System.out.print("ten sv: ");
            this.ten = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Ngay sinh (dd/MM/yyyy): ");
            try {
                this.ngaySinh = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                System.out.println("Nhap loi, xin moi nhap lai.");
            }
                System.out.print("diem TB: ");
            this.diemTB = sc.nextDouble();
            sc.nextLine();//để xử lý kí tự xuống dòng sau khi nhập số.
    }
    public void inThongTin(){
        System.out.println("MaSV = "+this.MaSV);
        System.out.println("Ten: "+this.ten);
        System.out.println("Ngay sinh: "+this.ngaySinh);
        System.out.println("Diem trung binh = "+this.diemTB);
        System.out.println("--------");
    }
    public int compareTo(SinhVien o){
        return Double.compare(o.diemTB,this.diemTB);
    }
}
