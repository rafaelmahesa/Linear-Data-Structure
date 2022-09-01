/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul05;

import static Modul05.SortAsc.bubbleSortAsc;
import static Modul05.SortAsc.insertionSortAsc;
import static Modul05.SortAsc.selectionSortAsc;
import static Modul05.SortDesc.bubbleSortDesc;
import static Modul05.SortDesc.insertionSortDesc;
import static Modul05.SortDesc.selectionSortDesc;
import java.util.Scanner;

/**
 *
 * @author Rafael Mahesa
 */
public class SortMain {

    public static void main(String[] args) {
        int pilihan;
        Scanner key = new Scanner(System.in);
        System.out.println("1. Buble Sort Ascending");
        System.out.println("2. Buble Sort Descending");
        System.out.println("3. Selection Sort Ascending");
        System.out.println("4. Selection Sort Descending");
        System.out.println("5. Insertion Sort Ascending");
        System.out.println("6. Insertion Sort Descending");
        System.out.print("Input Angka: ");
        pilihan = key.nextInt();
        switch (pilihan) {
            case 1: {
                int array[] = {5, 8, 26, 15, 11, 31};
                System.out.println();
                System.out.println("Bubble Sort Ascending");
                System.out.println("Data Sebelum Diurutkan");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println();
                bubbleSortAsc(array);
                System.out.println("Data Setelah Diurutkan");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println();
                break;
            }
            case 2:{
                int array[] = {5, 8, 26, 15, 11, 31};
                System.out.println();
                System.out.println("Bubble Sort Descending");
                System.out.println("Data Sebelum Diurutkan");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println();
                bubbleSortDesc(array);
                System.out.println("Data Setelah Diurutkan");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println();
                break;
            }
            case 3: {
                int array[] = {5, 8, 26, 15, 11, 31};
                System.out.println();
                System.out.println("Selection Sort Ascending");
                System.out.println("Data Sebelum Diurutkan");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println();
                selectionSortAsc(array);
                System.out.println("Data Setelah Diurutkan");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println();
                break;
            }
            case 4:{
                int array[] = {5, 8, 26, 15, 11, 31};
                System.out.println();
                System.out.println("Selection Sort Descending");
                System.out.println("Data Sebelum Diurutkan");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println();
                selectionSortDesc(array);
                System.out.println("Data Setelah Diurutkan");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println();
                break;
            }
            case 5:{
                int array[] = {5, 8, 26, 15, 11, 31};
                System.out.println();
                System.out.println("Insertion Sort Ascending");
                System.out.println("Data Sebelum Diurutkan");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println();
                insertionSortAsc(array);
                System.out.println("Data Setelah Diurutkan");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println();
                break;
            }
            case 6:{
                int array[] = {5, 8, 26, 15, 11, 31};
                System.out.println();
                System.out.println("Insertion Sort Descending");
                System.out.println("Data Sebelum Diurutkan");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println();
                insertionSortDesc(array);
                System.out.println("Data Setelah Diurutkan");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println();
                break;
            }
        }
    }
}
