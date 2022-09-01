/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu07;

/**
 *
 * @author Rafael Mahesa
 */
public class SortObject {
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
    public static void main(String[]args){
        Mahasiswa mhs[] = new Mahasiswa[6];
        mhs[0] = new Mahasiswa("Andi", 5);
        mhs[1] = new Mahasiswa("Cudi", 19);
        mhs[2] = new Mahasiswa("Bindy", 11);
        mhs[3] = new Mahasiswa("Dandy", 15);
        mhs[4] = new Mahasiswa("Elias", 31);
        mhs[5] = new Mahasiswa("Farhan", 26);
        
        System.out.println("Data belum terurut");
        for(int i=0; i<mhs.length; i++)
            System.out.print(mhs[i].getNim()+" "+mhs[i].getNama()+", ");
        System.out.println("");
        System.out.println("Data terurut");
        bubbleSortAscObject(mhs);
        for(int i=0; i<mhs.length; i++)
            System.out.print(mhs[i].getNim()+" "+mhs[i].getNama()+", ");
    }
}
