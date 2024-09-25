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
public class Bai2_Tuan3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);   
        System.out.println("Nhap diem: ");
        float diem = scanner.nextFloat();
        if(diem>8.0)
            System.out.println("Gioi");
        else
            if(diem>6.5)
                System.out.println("Kha");
            else
                if(diem>5.0)
                    System.out.println("Trung binh");
                else
                    System.out.println("Yeu");
    }
}
