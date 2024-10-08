package BAITHUCHANHTUAN6;

import java.util.Scanner;

public class Bai2_Tuan6 {
    public static class SinhVien {
        private String maSV;
        private String ten;
        private String ngaySinh;
        private double diemTB;
        static Scanner sc = new Scanner(System.in); // Static scanner để dùng trong main

        public SinhVien() {}

        public SinhVien(String maSV, String ten, String ngaySinh, double diemTB) {
            this.maSV = maSV;
            this.ten = ten;
            this.ngaySinh = ngaySinh;
            this.diemTB = diemTB;
        }

        public void Nhap() {
            System.out.print("Nhap ma sinh vien: ");
            maSV = sc.nextLine();
            System.out.print("Nhap ten sinh vien: ");
            ten = sc.nextLine();
            System.out.print("Nhap ngay sinh: ");
            ngaySinh = sc.nextLine();
            System.out.print("Nhap diem trung binh: ");
            diemTB = sc.nextDouble();
            sc.nextLine(); // Bo qua ki tu xuong dong
        }

        public void Xuat() {
            System.out.println("Ma sinh vien: " + maSV);
            System.out.println("Ten sinh vien: " + ten);
            System.out.println("Ngay sinh: " + ngaySinh);
            System.out.println("Diem trung binh: " + diemTB);
        }

        public double getDiemTB() {
            return diemTB;
        }

        public static void main(String[] args) {
            System.out.print("Nha so luong sinh vien: ");
            int soLuong = sc.nextInt();
            sc.nextLine(); // Bo qua ki tu xuong dong khi nhap so luong
            SinhVien[] dsSinhVien = new SinhVien[soLuong];

            for (int i = 0; i < soLuong; i++) { // Bắt đầu từ 0
                System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
                dsSinhVien[i] = new SinhVien();
                dsSinhVien[i].Nhap();
            }

            // Sắp xếp theo điểm trung bình
            for (int i = 0; i < soLuong - 1; i++) {
                for (int j = i + 1; j < soLuong; j++) {
                    if (dsSinhVien[i].getDiemTB() < dsSinhVien[j].getDiemTB()) {
                        SinhVien tg = dsSinhVien[i];
                        dsSinhVien[i] = dsSinhVien[j];
                        dsSinhVien[j] = tg;
                    }
                }
            }

            // In danh sách sinh viên sau khi sắp xếp
            System.out.println("\nDanh sach sinh vien sau khi sap xep:");
            for (int i = 0; i < soLuong; i++) {
                dsSinhVien[i].Xuat();
            }
        }
    }
}