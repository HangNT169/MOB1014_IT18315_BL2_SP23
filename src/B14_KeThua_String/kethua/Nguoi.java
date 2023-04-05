/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B14_KeThua_String.kethua;

/**
 *
 * @author hangnt
 */
public class Nguoi {
    // 6 thuoc tinh
    private String ten;
    private int tuoi;
    private int gioiTinh;
    private String queQuan;
    private String sdt;
    private String email;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, int gioiTinh, String queQuan, String sdt, String email) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.sdt = sdt;
        this.email = email;
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

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private void kiemTraGioiTinh() {
        if (gioiTinh == 0) {
            System.out.println("gioi tinh: Nu ");
        } else {
            System.out.println("gioi tinh: Nam ");
        }
    }

    public void display() {
        System.out.println("ten: " + ten);
        System.out.println("tuoi: " + tuoi);
//         if (gioiTinh == 0) {
//            System.out.println("gioi tinh: Nu ");
//        } else {
//            System.out.println("gioi tinh: Nam ");
//        }
//        kiemTraGioiTinh();
        // Toan tu 3 ngoi 
        System.out.println("Gioi tinh : " + (gioiTinh == 1 ? "Nam " : "Nu"));
        System.out.println("que quan: " + queQuan);
        System.out.println("so dien thoai: " + sdt);
        System.out.println("email : " + email);
    }
}
