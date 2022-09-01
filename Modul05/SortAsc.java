/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul05;

/**
 *
 * @author Rafael Mahesa
 */
public class SortAsc {

    public static int[] bubbleSortAsc(int[] data) {
        for (int iterasi = 0; iterasi < data.length - 1; iterasi++){
            for (int elemen = 0; elemen < data.length - 1 - iterasi; elemen++){
                if (data[elemen] > data[elemen + 1]){
                    int n = data[elemen];
                    data[elemen] = data[elemen + 1];
                    data[elemen + 1] = n;
                }
            }
        }
        return data;
    }

    public static int[] selectionSortAsc(int[] data){
        for (int i = 0; i < data.length - 1; i++){
            int min = data[i];
            int idxMin = i;
            for (int j = i; j < data.length; j++){
                if (min > data[j]){
                    min = data[j];
                    idxMin = j;
                }
            }
            if (idxMin != i){
                data[idxMin] = data[i];
                data[i] = min;
            }
        }
        return data;
    }

    public static int[] insertionSortAsc(int[] data){
        for (int i = 0; i < data.length; i++){
            int temp = data[i];
            int k = i - 1;
            while (k >= 0 && data[k] > temp){
                data[k + 1] = data[k];
                --k;
            }
            data[k + 1] = temp;
        }
        return data;
    }
    
    public static void bubbleSortAscObject(Object[] data) {
        for (int iterasi = 0; iterasi < data.length - 1; iterasi++){
            for (int elemen = 0; elemen < data.length - 1 - iterasi; elemen++){
                if (((Comparable)data[elemen]).compareTo(data[elemen+1])>0){
                    Object n = data[elemen];
                    data[elemen] = data[elemen + 1];
                    data[elemen + 1] = n;
                }
            }
        }
    }
    
    public static void selectionSortAscObject(Object[] data){
        for (int i = 0; i < data.length - 1; i++){
            int indxMin = i;
            for (int j = i; j < data.length; j++){
                if (((Comparable)data[j]).compareTo(data[indxMin])<0)
                    indxMin = j;
                
            }
            Object n = data[i];
            data[i] = data[indxMin];
            data[indxMin] = n;
        }
    }
    
    public static void insertionSortAscObject(int[] data){
        for (int i = 0; i < data.length; i++){
            int temp = data[i];
            int k = i - 1;
            while (k >= 0 && data[k] > temp){
                data[k + 1] = data[k];
                --k;
            }
            data[k + 1] = temp;
        }
    }
}