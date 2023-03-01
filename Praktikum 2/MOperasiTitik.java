/**
* File : MOperasiTitik.java 01/03/2023
* Penulis : Muhammad Rafasya Putra Ristianto
* Deskripsi :
* kelas yang berisi program main operasi titik
**/
class MOperasiTitik {
    public static void main(String[] args){
        Titik t = new Titik(5,5);
        OperasiTitik o = new OperasiTitik();
        System.out.println("Titik :(" + t.getAbsis() + "," + t.getOrdinat() + ")");
        o.refleksiX(t);
        System.out.println("Titik :(" + t.getAbsis() + "," + t.getOrdinat() + ")");
        o.refleksiY(t);
        System.out.println("Titik :(" + t.getAbsis() + "," + t.getOrdinat() + ")");
    }
}
