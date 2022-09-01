/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul06;

/**
 *
 * @author Rafael Mahesa
 */
public class QuickSort {
    static void tukar(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partisi(int[] arr, int bawah, int atas){
        int pivot = arr[atas]; 
        int i = (bawah - 1); 
        for(int j = bawah; j <= atas - 1; j++){
            if (arr[j] < pivot){
                i++;
                tukar(arr, i, j);
            }
        }
        tukar(arr, i + 1, atas);
        return (i + 1);
    }
    static void quickSort(int[] arr, int bawah, int atas){
        if (bawah < atas){
            int pi = partisi(arr, bawah, atas);
            quickSort(arr, bawah, pi - 1);
            quickSort(arr, pi + 1, atas);
        }
    }
}
