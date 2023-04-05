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
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten:");
        String ten = scanner.nextLine();
        System.out.println("Nhap tuoi:");
        int tuoi = Integer.valueOf(scanner.nextLine());
        System.out.println("Nhap gioi tinh:");
        int gioiTinh = Integer.valueOf(scanner.nextLine());
        System.out.println("Nhap que quan:");
        String queQuan = scanner.nextLine();
        System.out.println("Nhap sdt:");
        String sdt = scanner.nextLine();
        System.out.println("Nhap email:");
        String email = scanner.nextLine();
        Nguoi nguoi = new Nguoi(ten, tuoi, gioiTinh, queQuan, sdt, email);
        nguoi.display();
    }

}
