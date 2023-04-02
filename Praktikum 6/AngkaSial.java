/**
 * File : AngkaSial.java 01/04/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : Program penggunaan exception buatan sendiri
 * pengenalan klausa 'throw' dan 'throws'
*/
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial ");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka !!!");
        }
    }
}

/**
 * PERTANYAAN:
 * Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 * 
 * JAWAB :
 * Ketika eksepsi terjadi, baris 12 pada AngkaSial.java di atas tidak akan dieksekusi, 
 * karena program akan melompat ke blok catch pada baris 17 setelah eksepsi terjadi.
 * 
 * Baris 21 pada AngkaSial.java akan dieksekusi, karena program akan melanjutkan eksekusi 
 * setelah blok catch selesai dieksekusi.
 */