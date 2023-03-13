/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4_MangVaLenhLap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Mang {

    public static void main(String[] args) {
        /**
         * Mảng : Là tập hợp của tất cả các phần tử cùng kiểu dữ liệu VD:int
         * a[5]={-1,2,8,9}; Khi nhắc đến mảng : 1. Vị trí: Bắt từ 0 tới size -1
         * 2. Giá trị VD: vị trí 1 => Giá trị ở VT 1 : a[1] => Vị trí i bất kì
         * => Giá trị ở vị trí i : a[i]
         */
        // Nhập vào size của mảng
        // Nhập 1 mảng số nguyên từ bàn phím.
        // In mảng số nguyên 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size:");
        int size = sc.nextInt();
        // Cu phap khai bao mang thường trong Java 
        int[] arr = new int[size];
        System.out.println("Nhap cac gia tri cho mang:");
        for (int i = 0; i < size; i++) {
            // nhap cac gia tri 
            arr[i]=sc.nextInt();
        }
        System.out.println("In cac phan tu:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
    /**
     * Tạo 1 menu gồm các chức năng sau.Menu lặp lại tới khi chọn 0
     *   1. Nhập 1 mảng số nguyên  từ bàn phím với size cũng nhập từ bàn phím
     *   2. In mảng vừa nhập 
     *   3. Tính tổng các số lẻ trong mang
     *   4. Tính tích các số ở vị trí chẵn trong mảng
     *   0. Thoát
     */
}
