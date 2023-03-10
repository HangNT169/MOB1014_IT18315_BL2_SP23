/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_DieuKienReNhanh;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Buoi3 {

    public static void main(String[] args) {
        /**
         * 1.If..else if(dieuKien){ // code }else if(dk){ } ... else{ } Bt: Nhap
         * vao 1 so . Kiem tra do la so nguyen am khong ?
         */
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        if(number >0){
//            System.out.println("Nguyen duong");
//        }else if(number <0){
//            System.out.println("Nguyen am ");
//        }else{
//            System.out.println("Khong phai nguyen am cung khong phai nguyen duong");
//        }
        /**
         * 2. switch..case switch(tenBien){ case giaTri:{ // code break; } // co
         * bn case cung duoc default:{ // khong roi vao cac case tren break; } }
         * Nhap 1 so nguyen . In ra no thuoc quy nao trong nam
         */
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        switch(n){
//            case 1:{
//                System.out.println("Nguyen Duong");
//                break;
//            }
//        }
        Scanner sc = new Scanner(System.in);
        int thang = sc.nextInt();
        switch (thang) {
            // 1,2,3 => Quy 1
            // 4,5,6 => Quy 2
            // 7,8,9 => Quy 3
            // 10,11,12 => Quy 4
//            case 1: {
//                System.out.println("Quy 1");
//                break;
//            }
//            case 2: {
//                System.out.println("Quy 1");
//                break;
//            }
//            case 3: {
//                System.out.println("Quy 1");
//                break;
//            }
            case 1:
            case 2:
            case 3: {
                System.out.println("Quy 1");
                break;
            }
            case 4: {
                System.out.println("Quy 2");
                break;
            }
        }
    }
}
