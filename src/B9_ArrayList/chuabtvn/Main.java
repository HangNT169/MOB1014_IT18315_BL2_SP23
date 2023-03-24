/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_ArrayList.chuabtvn;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
//2. Tạo class SinhVien gồm các thuộc tính ma-String, 
    //ten- String, tuoi - int, gioiTinh- boolean và  các contrcutor,
    //getter, setter và hàm inThongTin(): void .
//Tạo class Main. Nhập từ bàn phím thông tin của 1 Sinh Viên và 
    //in ra màn hình .
    // Nhap ma, ten, tuoi,gioi tinh 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // B1: Nhap moi thong tin tu ban phim
        System.out.print("Nhap ma:");
        String ma = sc.nextLine();
        System.out.print("Nhap ten :");
        String ten = sc.nextLine();
        System.out.print("Nhap tuoi:");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.print("Nhap gioi tinh :");
        String gioiTinh = sc.nextLine();

        // B2: Tao doi tuong 
        // C1: Su dung contructor full tham so 
//        SinhVien sinhVien = new SinhVien(ma, ten,
//                tuoi, Boolean.valueOf(gioiTinh));
        // C2: Su dung contrucgor khong tham so 
        SinhVien sv = new SinhVien();
        sv.setTen(ten);
        sv.setMa(ma);
        sv.setTuoi(tuoi);
        sv.setGioiTinh(Boolean.valueOf(gioiTinh));
        // B3: In thong tin
//        sinhVien.inThongTin();
           sv.inThongTin();
    }
    
}
