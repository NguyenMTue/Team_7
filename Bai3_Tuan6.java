/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAITHUCHANHTUAN6;

import java.util.Scanner;

/**
 *
 * @author huynh
 */
public class Bai3_Tuan6 {
    public static class TaiKhoan {
        private String soTaiKhoan;
        private String chuTaiKhoan;
        private double soDu;
        static Scanner sc = new Scanner(System.in);

        public TaiKhoan() {
        }

        public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu) {
            this.soTaiKhoan = soTaiKhoan;
            this.chuTaiKhoan = chuTaiKhoan;
            this.soDu = soDu;
        }

        public void guiTien(double soTien) {
            if (soTien > 0) {
                soDu += soTien;
                System.out.println("Da gui " + soTien + ". So du hien tai: " + soDu);
            } else {
                System.out.println("So tien gui hai lon hon 0.");
            }
        }

        public void rutTien(double soTien) {
            if (soTien > 0 && soTien <= soDu) {
                soDu -= soTien;
                System.out.println("Da rut " + soTien + ". So du hien tai: " + soDu);
            } else {
                System.out.println("So tien rut khong ho le.");
            }
        }

        public void kiemTraSoDu() {
            System.out.println("So du hien tai: " + soDu);
        }

        public static void main(String[] args) {
            System.out.print("Nhap so tai khoan: ");
            String soTaiKhoan = sc.nextLine();
            System.out.print("Nhap ten chu tai khoan: ");
            String chuTaiKhoan = sc.nextLine();
            System.out.print("Nhap so du ban dau: ");
            double soDu = sc.nextDouble();

            TaiKhoan tk = new TaiKhoan(soTaiKhoan, chuTaiKhoan, soDu);

            boolean tiepTuc = true;
            while (tiepTuc) {
                System.out.println("Chon thao tac: ");
                System.out.println("1. Gui tien");
                System.out.println("2. Rut tien");
                System.out.println("3. Kiem tra so du");
                System.out.println("4. Thoat");

                int chon = sc.nextInt();

                switch (chon) {
                    case 1:
                        System.out.print("Nhap so tien gui: ");
                        double soTienGui = sc.nextDouble();
                        tk.guiTien(soTienGui);
                        break;
                    case 2:
                        System.out.print("Nhap so tien rut: ");
                        double soTienRut = sc.nextDouble();
                        tk.rutTien(soTienRut);
                        break;
                    case 3:
                        tk.kiemTraSoDu();
                        break;
                    case 4:
                        tiepTuc = false;
                        break;
                    default:
                        System.out.println("Lua chon khong hop le.");
                }
            }
        }
    }

}
