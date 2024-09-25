/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapCoMy.BaiThucHanh3;

/**
 *
 * @author DELL
 */
import  java.util.Scanner;
public class Tuan3Bai4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất (a): ");
        double a = sc.nextDouble();
        System.out.print("Nhập số thứ hai (b): ");
        double b = sc.nextDouble();
        System.out.print("Nhập số thứ ba (c): ");
        double c = sc.nextDouble();
        double min;
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("Số nhỏ nhất trong ba số " + a + ", " + b + ", " + c + " là: " + min );
    }
}
