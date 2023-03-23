/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_OverviewOOP;

/**
 *
 * @author hangnt
 */
public class Main {
//OOP (Lập trình hướng đối tượng):
    // 1. Tính đóng gói
    // 2. Tính kế thừa 
    // 3. Tính đa hình 
    // 4. Tính trừu tượng 
// Object có 2 đặc trưng :
    // 1. Thuộc tính ( đặc trưng ) <=> Biến <=> Danh Từ 
    // 2. Phương thức ( hành động) <=> Các Hàm <=> Động Từ 
    // VD: SinhVien : ten - thuộc tính - biến 
// Đề : Tạo class SinhVien gồm các thuộc tính : 
    // mssv - String , ten- String, tuoi - int,
    // gioiTinh - boolean, kyHoc - int, 
    // diaChi - String 
    // và các phương thức contructor, getter, setter
    // và hàm inThongTin(): void.
    // Nhập thông tin của 1 sinh viên 
    // và in ra màn hình 

    public static void main(String[] args) {
        // Cach goi 1 doi tuong // khoi tao 1 doi tuong 
        // Contructor khong tham so 
//        SinhVien sv = new SinhVien();
//        SinhVienService service = new SinhVienService();
        // In thong tin cua 1 sinh vien 
//        sv.inThongTin();
//       Nhap thong tin cua 1 sinh vien 
        // C1: Dung contructor full tham so 
        SinhVien a = new SinhVien("Vu Van Nguyen", "HE130351", 10, true, 11, "Lang Son", "1234567");
        a.inThongTin();
        
        // Tao class Giang Vien 
        // Gom cac thuoc tinh : account - String , ten- String,
        // tuoi - int, gioiTinh - boolean
        // va cac contructor, getter, setter  va ham display(): void 
        // Tao class Main1 de in thong tin cua 2 giang vien 
    }
}
