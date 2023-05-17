/**
 * File : BangunDatarGeneric.java 17/05/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : kelas konstriksi generic untuk BangunDatar
*/

package Generic;
public class BangunDatarGeneric<F4 extends BangunDatar> {
    private F4 bangunDatar;

    public void set (F4 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public F4 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
/**Dalam kode di atas T diganti dengan F4. Kita membuat parameter generic 
 * baru yang masih terikat oleh pembatasan. Namun sekarang kita menyebutnya
 * dengan F4. Pergantian karakter seperti ini hanya mempengaruhi nama parameter
 * generic yang digunakan dalam kelas BangunDatarGeneric
*/