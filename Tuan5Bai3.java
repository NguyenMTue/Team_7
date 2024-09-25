/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapCoMy.BaiThucHanh3;

import java.util.Arrays;
import java.util.Scanner;
public class Tuan5Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước của mảng: ");
        int n = sc.nextInt();

        // Tạo mảng và nhập các phần tử
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(array);

        // In ra mảng đã sắp xếp
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

