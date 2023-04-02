/**
 * File : Asersi2.java 01/04/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 * jari jari lingkaran bernilai nol
*/

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main (String[] args){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/**
 * PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
 * JAWAB : Ya, ada yang kurang tepat pada program Asersi2 di atas. 
 * Pada baris assert(jariJari>0):"jari jari tidak boleh nol!!!";, 
 * asersi ini bertujuan untuk memastikan bahwa jari-jari lingkaran yang diberikan pada 
 * konstruktor Lingkaran tidak sama dengan 0. Namun, pada program ini nilai jari-jari 
 * diberikan sebagai 0 sebelum membuat objek Lingkaran, sehingga asersi selalu akan 
 * gagal dan program akan terhenti.
 * Sebaiknya nilai jari-jari diberikan sebagai input dari pengguna atau diberikan 
 * nilai awal yang lebih besar dari 0 agar asersi tidak gagal.
 */