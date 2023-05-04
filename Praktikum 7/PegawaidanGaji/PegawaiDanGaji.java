/**
 * File : PegawaiDanGaji.java 03/05/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : merupakan program main untuk menjalankan program 
 * Pegawai.java, Manajer.java, Payroll.java, dan Programmer.java
*/

package PegawaidanGaji;

public class PegawaiDanGaji {
    public static void main(String[] args){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
