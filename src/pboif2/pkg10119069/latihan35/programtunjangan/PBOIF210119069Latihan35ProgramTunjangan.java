/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : program ini berisi program tunjangan
 */
public class PBOIF210119069Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Gaji gaji = new Gaji();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("===== Program Tunjangan =====");
        System.out.print("Berapa gaji anda per bulan? : ");
        gaji.gaji = keyboard.nextDouble();
        System.out.print("Status anda? (Menikah/Belum : ");
        gaji.status = keyboard.next();
        
        System.out.println();
        System.out.println("===== Hasil Perhitungan Gaji Anda =====");
        System.out.println("Gaji Pokok\t : " + gaji.gaji);
        
        
        System.out.println("-------------------------------------");
        System.out.println("Developed by : Tri Novarel Rahmadhani"); 
    }
}
