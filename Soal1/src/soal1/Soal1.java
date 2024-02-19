/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author Lenovo
 */

import java.util.Scanner;


public class Soal1 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah uang tabungan (dalam juta):");
        double tabungan = inputScanner.nextDouble();

        System.out.println("Apakah Anda sudah punya calon pasangan? (true/false):");
        boolean calonPasangan = inputScanner.nextBoolean();

        // Check apakah syarat untuk menikah terpenuhi
        System.out.println((tabungan > 100 && calonPasangan) ? "Anda dapat menikah!" : "Maaf, Anda belum memenuhi syarat untuk menikah.");
        
        inputScanner.close();
    } 
}


