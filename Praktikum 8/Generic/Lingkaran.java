package Generic;
/**
 * File : Lingkaran.java 17/05/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : Implementasi lingkaran sebagai BangunDatar
*/

import static java.lang.Math.PI;

public class Lingkaran extends BangunDatar{
    private double jejari;
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2*jejari*PI;
    }
}
