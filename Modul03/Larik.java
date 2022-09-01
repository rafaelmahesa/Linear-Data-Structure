/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul03;

/**
 *
 * @author Rafael Mahesa
 */
import java.util.Arrays;
public class Larik {
    public static void cetak(int[] array){
        for(int i=0; i<array.length; i++)
            System.out.println("Indeks ke-"+i+" : "+array[i]);
    }
    public static int sequentialSearch(int[] array, int dicari){
        for(int i=0; i<array.length; i++)
            if(array[i]==dicari)return i;
        return -1;
    }
    public static int binarySearch(int[] array, int dicari){
        int bawah=0, atas=array.length-1;
        while(bawah<=atas){
            int tengah=(bawah+atas)/2;
            if(dicari<array[tengah]) atas = tengah-1;
            else if(dicari>array[tengah]) bawah = tengah+1;
            else if(dicari==array[tengah]) return tengah;
        }
        return -1;
    }
    public static int interpolationSearch(int[] array, int dicari){
        int bawah=0, tengah, atas=array.length-1;
        for(int i=0; i<array.length; i++){
            tengah = bawah+((dicari-array[bawah])*(atas-bawah)/(array[atas]-array[bawah]));
            if(dicari==array[tengah]) return tengah;
            else{
                if(array[tengah]>dicari) atas = tengah-1;
                else bawah = tengah+1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int[] array={5, 8, 26, 15, 11, 31};
        Arrays.sort(array);
        cetak(array);
        System.out.println("Sequential Search: berada di indeks ke-"+sequentialSearch(array, 11));
        System.out.println("Binary Search: berada di indeks ke-"+binarySearch(array, 8));
        System.out.println("Interpolation Search: berada di indeks ke-"+binarySearch(array, 26));
    }
}
