/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_CRUDListFixCung.btvn.bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DienThoaiService {

    // Tạo class DienThoaiService sử dụng ArrayList<DienThoai> . 
    // Các chức năng viết trong class này
    // Nhap thong tin cua dien thoai  
    public void nhapThongTinDienThoai(ArrayList<DienThoai> lists) {
        // B1: Nhap tu ban phim 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ten: ");
        String ten = scanner.nextLine();
        System.out.println("Hang: ");
        String hang = scanner.nextLine();
        System.out.println("Mau: ");
        String mau = scanner.nextLine();
        System.out.println("Bo nho: ");
        int boNho = Integer.valueOf(scanner.nextLine());
        System.out.println("Gia: ");
        int gia = Integer.valueOf(scanner.nextLine());
        DienThoai dienThoai = new DienThoai(ten, hang, mau, boNho, gia);

        // B2: Add doi tuong vao arraylist
        lists.add(dienThoai);
    }

    // In thong tin 
    public void xuatThongTinDienThoai(ArrayList<DienThoai> lists) {
        // C1: for thuong 
        // Cach lay so phan tu trong mang : list.size()
//        for (int i = 0; i < lists.size(); i++) {
//            // in ra gia tri : get 
//            DienThoai dienThoai = lists.get(i);
//            dienThoai.inThongTin();
//        }
        // C2: foreach 
//        for (DienThoai dt : lists) {
//            dt.inThongTin();
//        }
        // C3: foreach + lamda (->) 
        lists.forEach(s -> s.inThongTin());
    }
    // Tim kiem min max 

    // Xoa dien thoai theo vi tri 
    // Sap xep dien thoai tang dan theo ten
    public void sapXepTangDanTheoTen(ArrayList<DienThoai> listDienThoai) {
        listDienThoai.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen()); // SS voi kieu du lieu chuoi 
        });
    }

    // Sap xep dien thoai giam dan theo gia 
    public void sapXepTheoGia(ArrayList<DienThoai> lists) {
        lists.sort((o1, o2) -> {
            return o1.getGia() - o2.getGia(); // SS voi kieu so 
        });
    }
}
