/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul05;

import static Modul05.SortAsc.bubbleSortAsc;
import static Modul05.SortDesc.bubbleSortDesc;
import static Modul05.SortAsc.selectionSortAsc;
import static Modul05.SortDesc.selectionSortDesc;
import static Modul05.SortAsc.insertionSortAsc;
import static Modul05.SortDesc.insertionSortDesc;
import java.util.Scanner;

/**
 *
 * @author Rafael Mahesa
 */
public class SortMainRandom {

    public static void main(String[] args) {
        int pilihan, n, array[];
        Scanner key = new Scanner(System.in);
        
        System.out.println("1. Buble Sort Ascending");
        System.out.println("2. Buble Sort Descending");
        System.out.println("3. Selection Sort Ascending");
        System.out.println("4. Selection Sort Descending");
        System.out.println("5. Insertion Sort Ascending");
        System.out.println("6. Insertion Sort Descending");
        System.out.print("Input Angka: ");
        pilihan = key.nextInt();
        System.out.print("Masukkan Nilai N: ");
        n = key.nextInt();
        System.out.println();
        
        array = new int[n];
        for (int i = 0; i < array.length; i++) array[i] = (int)(Math.random()*1000+1);
        
        switch (pilihan) {
            case 1: {
                long start, stop, waktu;
                start = System.nanoTime();
                bubbleSortAsc(array);
                stop = System.nanoTime();
                waktu = stop - start;
                System.out.println("Array N sebanyak: "+n);
                System.out.println(start);
                System.out.println(stop);
                System.out.println("Waktu yang dibutuhkan adalah: "+waktu+" ns");
                break;
            }
            case 2: {
                long start, stop, waktu;
                start = System.nanoTime();
                bubbleSortDesc(array);
                stop = System.nanoTime();
                waktu = stop - start;
                System.out.println("Array N sebanyak: "+n);
                System.out.println("Waktu yang dibutuhkan adalah: "+waktu+" ns");
                break;
            }
            case 3:{
                long start, stop, waktu;
                start = System.nanoTime();
                selectionSortAsc(array);
                stop = System.nanoTime();
                waktu = stop - start;
                System.out.println("Array N sebanyak: "+n);
                System.out.println("Waktu yang dibutuhkan adalah: "+waktu+" ns");
                break;
            }
            case 4:{
                long start, stop, waktu;
                start = System.nanoTime();
                selectionSortDesc(array);
                stop = System.nanoTime();
                waktu = stop - start;
                System.out.println("Array N sebanyak: "+n);
                System.out.println("Waktu yang dibutuhkan adalah: "+waktu+" ns");
                break;
            }
            case 5:{
                long start, stop, waktu;
                start = System.nanoTime();
                insertionSortAsc(array);
                stop = System.nanoTime();
                waktu = stop - start;
                System.out.println("Array N sebanyak: "+n);
                System.out.println("Waktu yang dibutuhkan adalah: "+waktu+" ns");
                break;
            }
            case 6:{
                long start, stop, waktu;
                start = System.nanoTime();
                insertionSortDesc(array);
                stop = System.nanoTime();
                waktu = stop - start;
                System.out.println("Array N sebanyak: "+n);
                System.out.println("Waktu yang dibutuhkan adalah: "+waktu+" ns");
                break;
            }
        }
    }
}
