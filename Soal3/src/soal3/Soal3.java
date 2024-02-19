/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3;

/**
 *
 * @author Lenovo
 */


import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        int kodeASCX, kodeASCY, jumlahKodeASCII;
        char karakterX, karakterY;
        Scanner input = new Scanner(System.in);
 
        System.out.print("Masukkan karakter 'X': ");
        karakterX = input.next().charAt(0);
        System.out.print("Masukkan karakter 'y': ");
        karakterY = input.next().charAt(0);

        kodeASCX = (int) karakterX;
        kodeASCY = (int) karakterY;
        jumlahKodeASCII = kodeASCX + kodeASCY;
        
        System.out.println("Jumlah Kode ASCII dari 'X' dan 'y' = " + jumlahKodeASCII);
    }
}



