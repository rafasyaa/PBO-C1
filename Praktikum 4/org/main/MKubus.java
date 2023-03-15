/**
 * File : MKubus.java 15/03/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : driver class untuk kubus
*/

package org.main;
import org.bangunruang.Kubus;
import org.bangundatar.BujurSangkar;

public class MKubus {
    public static void main(String[] args){
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas Permukaan kubus dengan panjang sisi 4 satuan = "+ kubus.hitungLuasAlas());
        System.out.println("Volume Kubus dengan panjang sisi 4 satuan = "+ kubus.hitungVolume());
    }
}
