/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul04;

/**
 *
 * @author Rafael Mahesa
 */
import java.util.Arrays;
public class Larik {
    public static int sequentialSearchObject(Object[] array, Object dicari){
        for(int i=0; i<array.length; i++)
            if(((Comparable) array[i]).compareTo(dicari) == 0)return i;
        return -1;
    }
    public static int binarySearchObject(Object[] array, Object dicari){
        int bawah=0, atas=array.length-1;
        while(bawah<=atas){
            int tengah=(bawah+atas)/2;
            if(((Comparable)array[tengah]).compareTo(dicari) == 1) atas = tengah-1;
            else if(((Comparable)array[tengah]).compareTo(dicari) == 0) return tengah;
            else bawah = tengah+1;
        }
        return -1;
    }
    public static int interpolationSearchObject(Object[] array, Object dicari){
        int bawah=0, atas=array.length-1;
        for(int i=0; i<array.length; i++){
            int tengah = bawah + ((((Mahasiswa)dicari).getNim() - ((Mahasiswa)array[bawah]).getNim())*
                (atas-bawah))/(((Mahasiswa)array[atas]).getNim() - ((Mahasiswa)array[bawah]).getNim());
            if(((Comparable)array[i]).compareTo(dicari) == 0) return tengah;
            else{
                if(((Comparable)array[tengah]).compareTo(dicari) == 1) atas = tengah-1;
                else bawah = tengah+1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Mahasiswa mhs[] = new Mahasiswa[6];
        mhs[0] = new Mahasiswa("Andi", 5);
        mhs[1] = new Mahasiswa("Budi", 8);
        mhs[2] = new Mahasiswa("Cindy", 11);
        mhs[3] = new Mahasiswa("Dandy", 15);
        mhs[4] = new Mahasiswa("Elias", 26);
        mhs[5] = new Mahasiswa("Farhan", 31);
        
        Mahasiswa cari1 = new Mahasiswa("Budi", 8);
        Mahasiswa cari2 = new Mahasiswa("Dandy", 15);
        Mahasiswa cari3 = new Mahasiswa("Elias", 20);
        
        int hasil1 = sequentialSearchObject(mhs, cari1);
        int hasil2 = binarySearchObject(mhs, cari2);
        int hasil3 = interpolationSearchObject(mhs, cari3);
        
        
        System.out.println("Sequential Search: berada di indeks ke- "+hasil1);
        System.out.println("Binary Search: berada di indeks ke- "+hasil2);
        System.out.println("Interpolation Search: berada di indeks ke- "+hasil3);
    }
}
