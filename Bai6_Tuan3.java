/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaitapTLTHDT;

import java.util.Scanner;

/**
 *
 * @author huynh
 */
public class Bai6_Tuan3 {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Chon phep tinh ban muon thuc hien :");
        System.out.println("1. Cong (+)");
        System.out.println("2. Tru (-)");
        System.out.println("3. Nhan (*)");
        System.out.println("4. Chia (/)");
        System.out.print("Nhap lua chon cua ban (1/2/3/4): ");
        int chon = sc.nextInt();
        System.out.print("Nhap so thu nhat: ");
        double so1 = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double so2 = sc.nextDouble();
        double ketqua;
        switch (chon) {
            case 1:
                ketqua = so1 + so2;
                System.out.println("Ket qua: " + so1 + " + " + so2 + " = " + ketqua);
                break;
            case 2:
                ketqua = so1 + so2;
                System.out.println("Ket qua: " + so1 + " - " + so2 + " = " + ketqua);
                break;
            case 3:
                ketqua = so1 * so2;
                System.out.println("Ket qua: " + so1 + " * " + so2 + " = " + ketqua);
                break;
            case 4:
                if (so2 != 0) {
                    ketqua = so1 / so2;
                    System.out.println("Ket qua: " + so1 + " / " + so2 + " = " + ketqua);
                } else
                    System.out.println("Khong the chia het cho 0");
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                break;
        }


        
    }
}
