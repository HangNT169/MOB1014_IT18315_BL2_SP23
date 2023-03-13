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
public class Lap {

    public static void main(String[] args) {
        /**
         * 1. for for(khoi tao gia tri, dieu kien;buocnhay){ // code } VD:
         * for(int i = 0;i<10;i++){ // code } 2. while while(dieukien){ // code
         * } 3. do..while do{ // code
         *
         * }while(dieukien);
         */
        // Tao 1 menu gom cac chuc nang. Menu lap di lap lai chon 0 dung 
        // 1. Nhap vao 2 so nguyen. Tinh tong.
        // 2. Nhap vao ten, tuoi,dia chi cua ban than va in ra man hinh.
        // 0. Thoat
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Nhap vao 2 so nguyen. Tinh tong");
        System.out.println("2.Nhap vao ten, tuoi,dia chi cua ban than va in ra man hinh.");
        System.out.println("0.Thoat ");
        int chucNang = 0;
        do {
            System.out.println("Moi nhap chuc nang:");
            chucNang = sc.nextInt();
            switch (chucNang) {
                case 1: {
                    System.out.println("Chuc nang 1");
                    // code
                    break;
                }
                case 2: {
                    System.out.println("Chuc nang 2");
                    // code
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Chuc nang khong ton tai:");
                    break;
                }
            }
        } while (chucNang != 0);
    }
}
