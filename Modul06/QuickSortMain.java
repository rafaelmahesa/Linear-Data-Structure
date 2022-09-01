/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul06;

import static Modul06.QuickSort.quickSort;
import static Modul06.QuickSortObject.quickSortObj;

/**
 *
 * @author Rafael Mahesa
 */
public class QuickSortMain {
    public static void main(String[] args){
        int[] array = {5, 8, 26, 15, 11, 31, 7, 40, 23, 25};
        Mahasiswa mhs[] = new Mahasiswa[10];
        mhs[0] = new Mahasiswa("Andi", 5);
        mhs[1] = new Mahasiswa("Budi", 8);
        mhs[2] = new Mahasiswa("Cindy", 26);
        mhs[3] = new Mahasiswa("Dandy", 15);
        mhs[4] = new Mahasiswa("Elias", 11);
        mhs[5] = new Mahasiswa("Farhan", 31);
        mhs[6] = new Mahasiswa("Gani", 7);
        mhs[7] = new Mahasiswa("Hobart", 40);
        mhs[8] = new Mahasiswa("Isa", 23);
        mhs[9] = new Mahasiswa("Jack", 25);
        int m = mhs.length;
        int n = array.length;
        System.out.println("Quick Sort");
        System.out.println("Array Integer");
        System.out.println("Data Sebelum Diurutkan");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        quickSort(array, 0, n - 1);
        System.out.println("Data Setelah Diurutkan");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Array Object");
        System.out.println("Data Sebelum Diurutkan");
        for(int i=0; i<mhs.length; i++)
            System.out.print(mhs[i].getNim()+" "+mhs[i].getNama()+", ");
        System.out.println("");
        System.out.println("Data Setelah Diurutkan");
        quickSortObj(mhs, 0, m-1);
        for(int i=0; i<mhs.length; i++)
            System.out.print(mhs[i].getNim()+" "+mhs[i].getNama()+", ");
    }
}
