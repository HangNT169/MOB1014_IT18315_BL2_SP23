/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_ArrayList.chuabtvn;

/**
 *
 * @author hangnt
 */
public class SinhVien {

    //2. Tạo class SinhVien gồm các thuộc tính ma-String, 
    //ten- String, tuoi - int, gioiTinh- boolean và  các contrcutor,
    //getter, setter và hàm inThongTin(): void .
    private String ma;
    private String ten;
    private int tuoi;
    private boolean gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, int tuoi, boolean gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void inThongTin() {
        System.out.println("Ma : " + ma);
        System.out.println("Ten : " + ten);
        System.out.println("Gioi tinh : " + gioiTinh);
        System.out.println("Tuoi : " + tuoi);
    }
}
