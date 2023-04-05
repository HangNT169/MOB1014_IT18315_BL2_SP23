/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B14_KeThua_String.demo_string;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str = scanner.nextLine();
        // SS 2 chuoi 
        // 1. compareTo /compareToIgnoreCase => int 
        // 0 : 2 chuoi bang nhau
        System.out.println(str.compareTo("ahihi")); // phan biet hoa thuong
        // Khong phan biet chu hoa thuong
        System.out.println(str.compareToIgnoreCase("ahihi"));
        // 2. equals / equalsIgnoreCase => boolean 
        System.out.println(str.equals("ahihi"));
        System.out.println(str.equalsIgnoreCase("ahihi"));
        // 3. Dung dau == : Khong dung 
        // Do dai cua 1 chuoi : length 
        // Kiem tra chua : contains 
        System.out.println(str.contains("i"));
        // 4. Bat dau bang : startWith 
        System.out.println(str.startsWith("IT"));
        // 5. Ket thuc bang : endWith
        System.out.println(str.endsWith("IT"));
        // 6. Xoa khoang trang dau va cuoi : trim()
        System.out.println(str.trim());
        //https://v1study.com/java-ham-xu-ly-chuoi-string-a577.html
    }
}
