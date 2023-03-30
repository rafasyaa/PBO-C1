/**
 * File : Lingkaran.java 29/03/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : Kelas yang mengimplementasi IArea berupa cara menghitung luas lingkaran
*/

import static java.lang.Math.PI;

public class Lingkaran implements IArea{
    public double jejari;
    public Lingkaran(double r){
        jejari = r;
    }
    public double hitungLuas(){
        return PI * jejari * jejari;
    }
}
