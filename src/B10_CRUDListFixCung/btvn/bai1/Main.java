/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_CRUDListFixCung.btvn.bai1;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("maDV");
        String maDV = scanner.nextLine();
        System.out.println("ten");
        String ten = scanner.nextLine();
        System.out.println("tuoi");
        int tuoi = scanner.nextInt();
        System.out.println("canNang");
        double canNang = scanner.nextDouble();
        DongVat dongVat = new DongVat(maDV, ten, tuoi, canNang);
        dongVat.inThongTin();
    }

}
