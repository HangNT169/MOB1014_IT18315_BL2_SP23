/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B14_KeThua_String.kethua;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi = Integer.valueOf(scanner.nextLine());
        System.out.println("Nhap gioi tinh: ");
        int gioiTinh = Integer.valueOf(scanner.nextLine());
        System.out.println("Nhap que quan: ");
        String queQuan = scanner.nextLine();
        System.out.println("Nhap sdt: ");
        String sdt = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap diem: ");
        double diem = Double.valueOf(scanner.nextLine());

//        SinhVien sinhVien = new SinhVien();
//        sinhVien.setDiem(diem);
//        sinhVien.setEmail(email);
//        sinhVien.setGioiTinh(gioiTinh);
//        sinhVien.setQueQuan(queQuan);
//        sinhVien.setSdt(sdt);
//        sinhVien.setTen(ten);
//        sinhVien.setTuoi(tuoi);
        SinhVien sinhVien = new SinhVien(diem, ten, tuoi, gioiTinh, queQuan, sdt, email);
        sinhVien.display();

    }
}
