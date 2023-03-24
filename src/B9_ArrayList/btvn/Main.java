/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_ArrayList.btvn;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
//    1. Tạo các class sau  ( Bắt buộc)
//    - Nguoi gồm các thuộc tính : ten-String, tuoi-int, diaChi-String, và các contrcutor, getter, setter và hàm inThongTin(): void 
//    - DongVat gồm các thuộc tính : maDV- String, ten-String, tuoi-int, canNang-double, và các contrcutor, getter, setter và hàm inThongTin(): void 
//    - ThucVat gồm các thuộc tính : maTV- String, ten-String, tuoi-int, chieuCao-double, khuVucSong- String và các contrcutor, getter, setter và hàm display(): void 
//    - LopHoc gồm các thuộc tính : ten-String, toa-String, diaChi-String,  dienTich - int và các contrcutor, getter, setter và hàm inThongTin(): void 
//    - MayTinh gồm các thuộc tính :ma- String  ten-String, dongMay -String , gia-float, và các contrcutor, getter, setter và hàm inThongTin(): void 
//    Tạo class Main in thông tin của 5 đối tượng trên  
//
//2. Tạo class SinhVien gồm các thuộc tính ma-String, ten- String, tuoi - int, gioiTinh- boolean và  các contrcutor, getter, setter và hàm inThongTin(): void .
//Tạo class Main. Nhập từ bàn phím thông tin của 1 Sinh Viên và in ra màn hình .

    public static void main(String[] args) {
//        Nguoi nguoiThuong = new Nguoi("Nguyen Hung Manh", 19, "BA VI");

//        nguoiThuong.inThongTin();
        Scanner sc = new Scanner(System.in);
        Nguoi nguoi = new Nguoi();
        System.out.println("Nhap vao ten: ");
        nguoi.setTen(sc.nextLine());
        System.out.println("Nhap vao tuoi: ");
        nguoi.setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap vao dia chi: ");
        nguoi.setDiaChi(sc.nextLine());
        nguoi.inThongTin();

    }

}
