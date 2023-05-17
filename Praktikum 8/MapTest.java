/**
 * File : MapTest.java 17/05/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : program yang menggunakan Generic untuk 
 *             pasangan Kunci-Nilai
*/

import java.util.*;
public class MapTest {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "satu");
        map.put(2, "dua");
        System.out.println(map.get(1));
        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            System.out.println("Elemen Kunci: " + key + "Nilai : ");
        }
        
        for(Integer key : keys){
            System.out.println("Elemen Kunci: " + key);
        }

        Collection<String> values = map.values();
        for (String value : values){
            System.out.println("Elemen Nilai: " + value);
        }
    }
}
