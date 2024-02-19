/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        int pembilangSatu, penyebutSatu, pembilangDua, penyebutDua, pembilangTiga, penyebutTiga;
        double pecahanSatu, pecahanDua, pecahanTiga;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pecahan pertama : ");
        pembilangSatu = input.nextInt();
        penyebutSatu = input.nextInt();
        System.out.print("Masukkan pecahan kedua : ");
        pembilangDua = input.nextInt();
        penyebutDua = input.nextInt();
        System.out.print("Masukkan pecahan ketiga : ");
        pembilangTiga = input.nextInt();
        penyebutTiga = input.nextInt();

        pecahanSatu = (double) pembilangSatu / penyebutSatu;
        pecahanDua = (double) pembilangDua / penyebutDua;
        pecahanTiga = (double) pembilangTiga / penyebutTiga;

        System.out.println("=========================");
        System.out.println("Hasil penjumlahan \t: " + (pecahanSatu + pecahanDua + pecahanTiga));
        System.out.println("Hasil pengurangan \t: " + (pecahanSatu - pecahanDua - pecahanTiga));
        System.out.println("Hasil perkalian \t: " + (pecahanSatu * pecahanDua * pecahanTiga));
        System.out.println("Hasil pembagian \t: " + (pecahanSatu / pecahanDua / pecahanTiga));
    }
}

