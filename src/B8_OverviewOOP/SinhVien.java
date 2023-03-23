/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_OverviewOOP;

/**
 *
 * @author hangnt
 */
public class SinhVien {
    // Tạo class SinhVien gồm các thuộc tính : 
    // mssv - String , ten- String, tuoi - int,
    // gioiTinh - boolean, kyHoc - int, 
    // diaChi - String , matKhauFacebook - String 
    // và các phương thức contructor, getter, setter
    // và hàm inThongTin(): void.

    // Cac Biến : mssv - String , ten - String , tuoi - int 
    // gioiTinh - boolean, kyHoc - int, diaChi - String , 
    // matKhauFacebook - String 
    // Thuộc tính <=> Các biến 
    // Tinh dong goi : Pham vi truy cap (Access modifier): 
    // public , protected, default, private 
    private String mssv;
    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    private int kyHoc;
    private String diaChi;
    private String matKhauFacebook;

    // https://viettuts.vn/interview/list-cau-hoi-phong-van-java-core
    // Phuong thuc: contructor, getter, setter, 
    // Co 2 loai contructor :
    // 1. Contructor khong tham so 
    // 2. Contructor co tham so 
    // Contructor : dùng để khởi tạo 1 đối tượng .
    // Đặc trưng của contructor :
    //  - Cùng tên với Class 
    //  - Không có kiểu dữ liệu trả về ( k có return)
    // Mặc định của 1 Class là loại Contructor KHÔNG THAM SỐ 
    // Không 
    public SinhVien() {
    }
//
//    // Có tham số 
    public SinhVien(String mssv, String ten, int tuoi, boolean gioiTinh, int kyHoc, String diaChi, String matKhauFacebook) {
        this.mssv = mssv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.kyHoc = kyHoc;
        this.diaChi = diaChi;
        this.matKhauFacebook = matKhauFacebook;
    }

//    // Contructor Có Tham 
//    public SinhVien(String mssv, String ten, int tuoi, boolean gioiTinh, String matKhauFacebook) {
//        this.mssv = mssv;
//        this.ten = ten;
//        this.tuoi = tuoi;
//        this.gioiTinh = gioiTinh;
//        this.matKhauFacebook = matKhauFacebook;
//    }
    // GETTER : Lay du lieu 
    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
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

    // SETTER : Thay doi gia tri 
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatKhauFacebook() {
        return matKhauFacebook;
    }

    public void setMatKhauFacebook(String matKhauFacebook) {
        this.matKhauFacebook = matKhauFacebook;
    }

    // Ham inThongTin(): void 
    public void inThongTin() {
        System.out.println("MSSV: " + mssv);
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia Chi: " + diaChi);
        System.out.println("Ky Hoc: " + kyHoc);
        System.out.println("Mat khau: " + matKhauFacebook);
    }

}
