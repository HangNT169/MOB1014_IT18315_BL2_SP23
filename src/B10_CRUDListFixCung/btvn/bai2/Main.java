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
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DienThoai> listDienThoai = new ArrayList<>();
        System.out.println("-----Menu----");
        System.out.println("1.Nhap thong tin");
        System.out.println("2.In thong tin");
        System.out.println("3.Tim kiem dien co gia trong khoang min max");
        System.out.println("4.Xoa dien thoai theo vi tri muon xoa");
        System.out.println("5.Sap xep dien thoai theo ten");
        System.out.println("6.Sap xep dien thoai theo ten");
        System.out.println("0.Thoát");
        int chucNang = 0;
        do {
            System.out.println("Enter your choice: ");
            chucNang = Integer.valueOf(scanner.nextLine());
            switch (chucNang) {
                case 1:
                    // Cu phap goi 1 ham o 1 class bat ky.
                    // new tenClassChuaHam().tenHam();
                    new DienThoaiService().nhapThongTinDienThoai(listDienThoai);
                    break;
                case 2:
                    new DienThoaiService().xuatThongTinDienThoai(listDienThoai);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 0:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Bạn đã nhập sai, vui lòng nhập lại !!");
                    break;
            }
        } while (chucNang != 0);
    }
}
