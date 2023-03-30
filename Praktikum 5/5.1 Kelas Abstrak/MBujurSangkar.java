/**
 * File : MBujurSangkar.java 29/03/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : driver class untuk bujur sangkar
*/

import java.util.Scanner;

public class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.println("Masukkan sisi bujur sangkar: ");
		double sisi = scan.nextDouble();
		scan.close();
		System.out.println("Luas bujur sangkar dengan sisi " + sisi + " adalah " + bs.hitungLuas(sisi));
	}
}