/**
 * File : Manajer.java 03/05/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : merupakan program super class untuk pegawai
 * yang berisi atribut dan method pegawai
*/

package PegawaidanGaji;

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : "+nama+", Gaji pokok : "+gajiPokok);
    }
}
