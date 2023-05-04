/**
 * File : Programmer.java 03/05/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : merupakan program sub class untuk pegawai
 * yang berisi atribut dan method programmer
*/

package PegawaidanGaji;

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
        setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : "+bonus);
    }
}
