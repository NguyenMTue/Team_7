import java.util.Scanner;

public class TaiKhoanNH {
    private String soTK;
    private String chuTK;
    private double soDu;
    public String getSoTK()
    {
        return this.soTK;
    }
    public String getChuTK(){
        return this.chuTK;
    }
    public double getSoDu()
    {
        return  this.soDu;
    }
    public void setSoTK(String sot){
        this.soTK=sot;
    }

    public void setChuTK(String c) {
        this.chuTK = c;
    }

    public void setSoDu(double sod) {
        this.soDu = sod;
    }
    public TaiKhoanNH(){}
    public TaiKhoanNH(String sot, String c, double sod){
        this.soTK=sot;
        this.chuTK=c;
        this.soDu=sod;
    }
    public void guiTien(double soT)
    {
        if(soT>0)
        {
            this.soDu=this.soDu+soT;
            System.out.println("bạn đã gửi "+soT+" vao tai khoan cua ban.");
        }
        else
            System.out.println("so tien gui vao phai lon hon 0.");
    }
    public void rutTien(double soT)
    {
        if(soT>0&&soT<=soDu)
        {
            this.soDu=this.soDu-soT;
            System.out.println("bạn đã rút "+soT+" ra khỏi tài khoản");
        }
        else
            System.out.println("khong the rut tien, vi co the so tien ban rut khong lon hon 0 hoac so tien lon hon so du cua ban");
    }
    public void kiemTra()
    {
        System.out.println("so du trong tk la: "+soDu);
    }
    public void NhapThongTin()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so tai khoan: ");
        this.soTK=sc.nextLine();
        System.out.println("Nhap vao chu tai khoan");
        this.chuTK=sc.nextLine();
        System.out.print("Nhap vao so du cua tai khoan: soDu=");
        this.soDu=sc.nextDouble();
    }
    public void inThongTin()
    {
        System.out.println("soTK: "+this.soTK);
        System.out.println("tenChuTK: "+this.chuTK);
        System.out.println("soDu: "+this.soDu);
        System.out.println("------");
    }
}
