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
public class SortDesc {

    public static int[] bubbleSortDesc(int[] data) {
        for (int iterasi = 1; iterasi <= data.length - 1; iterasi++){
            for (int elemen = 0; elemen <= data.length - 1 - iterasi; elemen++){
                if (data[elemen] < data[elemen + 1]){
                    int temp = data[elemen];
                    data[elemen] = data[elemen + 1];
                    data[elemen + 1] = temp;
                }
            }
        }
        return data;
    }

    public static int[] selectionSortDesc(int[] data){
        for (int i = 0; i < data.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < data.length; j++){
                if (data[j] > data[min]){
                    min = j;
                    int temp = data[min];
                    data[min] = data[i];
                    data[i] = temp;
                }
            }
        }
        return data;
    }

    public static int[] insertionSortDesc(int[] data){
        for (int i = 1; i < data.length; i++){
            int temp = data[i];
            int k = i - 1;
            while (k >= 0 && temp > data[k]){
                data[k + 1] = data[k];
                --k;
            }
            data[k + 1] = temp;
        }
        return data;
    }
}
