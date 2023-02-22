/**
* File : Titik.java
* Penulis : Muhammad Rafasya Putra Ristianto
* Deskripsi :
* kelas yang berisi program titik
**/
class Titik{
	double absis;
	double ordinat;
	static int counterTitik; //menghitung objek titik
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
	void setAbsis(double a){
		absis = a;
	}
	void setOrdinat(double o){
		ordinat = o;
	}
	double getAbsis(){
		return absis;
	}
	double getOrdinat(){
		return ordinat;
	}
	int getCounterTitik(){
		return counterTitik;
	}
}