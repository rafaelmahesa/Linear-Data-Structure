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
public class QuickSortObject {
    static void quickSortObj(Object[] arr, int bawah, int atas){
        if (bawah < atas){
            int i = bawah + 1;
            int j = atas;
            while ((i <= atas) && ((((Comparable) arr[i]).compareTo(arr[bawah]) < 0) || (((Comparable)
                    arr[i]).compareTo(arr[bawah]) == 0))) i += 1;
            while ((j > bawah) && (((Comparable) arr[j]).compareTo(arr[bawah]) > 0))j -= 1;
            while (i < j){
               Object n = arr[i];
                arr[i] = arr[j];
                arr[j] = n;
               while ((i <= atas) && ((((Comparable) arr[i]).compareTo(arr[bawah]) < 0) || (((Comparable)
                       arr[i]).compareTo(arr[bawah]) == 0))) i += 1;
                while ((j > bawah) && (((Comparable) arr[j]).compareTo(arr[bawah]) > 0)) j -= 1;
            }
            Object temp = arr[bawah];
            arr[bawah] = arr[j];
            arr[j] = temp;
            quickSortObj(arr, bawah, j - 1);
            quickSortObj(arr, j + 1, atas);
        }
    }
}
