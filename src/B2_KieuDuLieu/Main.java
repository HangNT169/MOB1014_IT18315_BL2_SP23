/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieu;

// Cach khai bao thu vien trong Java
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        /**
         * 1. Kiểu dữ liệu Trong Java có 2 loại kiểu dữ liệu : 1.1. Kiểu nguyên
         * thuỷ : int, float, double, String .. 1.2. Kiểu dữ liệu Object :
         * Integer, Float, Double,String..
         */
        /**
         * // Cach comment
         */
        // Dấu hiệu nhận biết :
        // new => kiểu dữ liệu Object 
        // . => xuât hiện gợi ý 
        // nguyên thuỷ : chữ cái đầu viết thường 
        // Object:chữ cái đầu viết hoa 
        // String vừa là kiểu dữ liệu nguyên thuỷ,
        // vừa là kiểu dữ liệu Object
        int number = 5;
        float number1 = 6;
        String str = "Helloworld";
        // Cach khai bao String 
        String str1 = new String("HIHI");
//        str1.
        // In giá trị của 1 biến 
//        System.out.println("Number=" + number);
//        System.out.println("String = " + str);
//        System.out.println("Number = " + number + " Chuoi la :" + str);
        int a = 5;
        int b = 4;
        double thuong = (1.0 * a) / b;
//         System.out.println(thuong);
        /**
         * 2. Nhập từ bàn phím scanf => Nhập trong C Scanner => Nhập từ bàn phím
         * trong Java
         */
        Scanner sc = new Scanner(System.in);
        // Nhap so nguyen 
//        System.out.println("Nhap so nguyen:");
//        int n = sc.nextInt();
//        float n1 = sc.nextFloat();
//        double n2 = sc.nextDouble();
        // Nhap chuoi 
        // nextLine => Lay duoc het ca khoang cach 
        // next => Khi gap khoang cach => Khong doc duoc nua
//        String s = sc.nextLine();
//        String s1 = sc.next();
//        System.out.println("Str1 " + s);
//        System.out.println("Str2 " + s1);

//        System.out.println("Number "+n);
        // B1: Nhập tên,trường học, địa chỉ, quê quán cuả bản thân và in ra man hình
        // B2: Nhập tên,tuổi,địa chỉ của bản thân và in ra màn hình
        System.out.println("Nhap ten:");
//        String ten = sc.nextLine();
//        System.out.println("Nhap tuoi :");
//        int tuoi = sc.nextInt();
//        // xoa bo nho dem 
//       // c1:Them sc.nextLine
//        sc.nextLine();
//        System.out.println("Nhap dia chi:");
//        String diaChi = sc.nextLine();
//        System.out.println("Ten = " + ten + " Tuoi =" + tuoi + " Dia chi = " + diaChi);
        // c2: Coi tat ca moi cai nhap tu ban phim vao luon luon la chuoi
        // Sau do ep kieu ve kieu du lieu tuong ung
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi:");
        String s1 = sc.nextLine();
        int tuoi = Integer.valueOf(s1);
        System.out.println("Nhap dia chi:");
        String diaChi = sc.nextLine();
        System.out.println("Ten = " + ten + " Tuoi =" + tuoi + " Dia chi = " + diaChi);

    }
}
