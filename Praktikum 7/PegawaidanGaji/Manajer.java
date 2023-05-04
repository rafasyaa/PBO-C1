/**
 * File : Manajer.java 03/05/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : merupakan program sub class untuk pegawai
 * yang berisi atribut dan method manajer
*/

package PegawaidanGaji;

public class Manajer extends Pegawai{
    private int tunjangan = 700000;
    public Manajer(String nama){
        setNama(nama);
    }
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : "+ tunjangan);
    }
}
