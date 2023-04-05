/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B14_KeThua_String.kethua;

/**
 *
 * @author hangnt
 */
public class SinhVien extends Nguoi{
    // Tinh dong goi : Pham vi truy cap 
    // 4: public, protected, default, private 
    // Tinh ke thua : Con sẽ kế thừa tất cả thuộc
    // tinh,phương thức của Cha
    // Từ khoá : extends - Kế thừa
    // 7 thuoc tinh = 6(Nguoi) + 1(SinhVien)
    private double diem;

    public SinhVien() {
    }

    public SinhVien(double diem, String ten, int tuoi, int gioiTinh, String queQuan, String sdt, String email) {
        super(ten, tuoi, gioiTinh, queQuan, sdt, email);
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    public void display(){
        // Lay thuoc tinh, phuong thuc cha 
        // Dung super
//        System.out.println("Ten: "+ super.getTen());
//        System.out.println("Tuoi: "+super.getTuoi());
//        System.out.println("Gioi tinh: " + super.getGioiTinh());
//        System.out.println("Que quan: " + super.getQueQuan());
        System.out.println("Diem: "+diem);
        super.display();
//        super.ki
    }
}
