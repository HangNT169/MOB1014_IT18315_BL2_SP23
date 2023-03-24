/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_ArrayList.arraylist;

import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public class Main {

    // Mang : vi tri , gia tri 
    // Mang dong : ArrayList : khong can quan tam toi so luong phan tu 
    public static void main(String[] args) {
        // Cu phap khai bao mang dong 
        // ArrayList<KieuDuLieu>ten cua mang = new ArrayList<>()
        ArrayList<Integer> listSoNguyen = new ArrayList<>();
//        ArrayList<Float> lists = new ArrayList<>();
        // Truoc 
        System.out.println("Size = " + listSoNguyen.size());
        // ADD : Them phan tu 
        listSoNguyen.add(16);
        listSoNguyen.add(20);
        listSoNguyen.add(20);
        System.out.println("Size sau = " + listSoNguyen.size());
        // Xoa phan tu 
//        listSoNguyen.remove(16);
//        System.out.println("Size sau = " + listSoNguyen.size());
    }
}
