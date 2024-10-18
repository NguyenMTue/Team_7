import java.util.*;

public class Bai2_Tuan6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SinhVien> danhSachSV=new ArrayList<>();
        System.out.println("Nhap vao so lương sinh vien: ");
        int n= sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n;i++)
        {
            System.out.println("\nNhap thong tin sinh vien thu "+(i+1)+":");
            SinhVien sv=new SinhVien();
            sv.nhapThongTin();
            danhSachSV.add(sv);//thêm sinh viên vao danh sach
        }

        System.out.println("\nIn thông tin của các sinh vien: \n");
        for(SinhVien sv:danhSachSV)
            sv.inThongTin();
        Collections.sort(danhSachSV);
        System.out.println("danh sach sau khi da sap xep: ");
        System.out.println("\nIn thông tin của các sinh vien");
        for(SinhVien sv:danhSachSV)
            sv.inThongTin();
    }
}
