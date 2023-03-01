/**
* File : Titik.java
* Penulis : Muhammad Rafasya Putra Ristianto
* Deskripsi :
* kelas yang berisi program titik
**/
class Titik{
	private double absis;
	private double ordinat;
	private static int counterTitik; //menghitung objek titik
	Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	public void setAbsis(double a){
		absis = a;
	}
	public void setOrdinat(double o){
		ordinat = o;
	}
	public double getAbsis(){
		return absis;
	}
	public double getOrdinat(){
		return ordinat;
	}
	public int getCounterTitik(){
		return counterTitik;
	}
}
