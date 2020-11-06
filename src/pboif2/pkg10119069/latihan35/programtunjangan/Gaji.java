/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan35.programtunjangan;

/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 */
public class Gaji {
    double gaji;
    String status;
    
    public double hitungTunjangan() {
        double tunjangan;
        if (status.equals("menikah") || status.equals("Menikah")) {
            tunjangan = 0.35 * gaji;
        } else {
            tunjangan = 0;
        }
        return tunjangan;
    }
    
    public double hitungTotalGaji() {
        return gaji + hitungTunjangan();
    }
}
