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
public class Bai1_Tuan6 {
    public static class HCN{
        private double A;
        private double B;
        static Scanner sc=new Scanner(System.in);

        public HCN(){
        }
        public HCN(double a, double b){
            this.A=a;
            this.B=b;

        }

        public double getA(){
            return  A;
        }
        public void setA(double a){
            A=a;
        }
        public double getB(){
            return  B;
        }
        public void setB(double b){
            B=b;
        }

        public double ChuVi(){
            return 2*(A+B);
        }
        public double DienTich(){
            return A*B;
        }
        public void Nhap(){
            System.out.print("Nhap chieu dai A: ");
            this.A=sc.nextDouble();
            System.out.print("Nhap chieu rong B: ");
            this.B=sc.nextDouble();
        }
        public void Xuat(){
            System.out.println("Chieu dai A: "+this.A);
            System.out.println("Chieu rong B: "+this.B);
            System.out.println("Chu vi Bai1_Tuan6: " +this.ChuVi());
            System.out.println("Dien tich Bai1_Tuan6: " +this.DienTich());
        }

        public static void main( String args[] ){
            HCN hcn=new HCN();
            hcn.Nhap();
            hcn.Xuat();
        }
    }
}


