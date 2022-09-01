/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu01;

/**
 *
 * @author Rafael Mahesa
 */
public class LarikKu {
    private double data[];
    private int maxData, jumlahData=0;
    
    LarikKu(int maxData){
        this.maxData=maxData;
        data = new double[maxData];
    }
    
    public void tambahBelakang(double Data){
        data[jumlahData]=Data;
        jumlahData++;
    }
    public void tambahDepan(double Data){
        for(int x=jumlahData; x>0;){
            this.data[x] = this.data[--x];
        }
        data[0]=Data;
        jumlahData++;
    }
    public void printData(){
        System.out.println("Jumlah Data = "+jumlahData);
        System.out.print("Larik       = ");
        for(int x=0; x<jumlahData; x++){
            System.out.print(data[x]+"; ");
        }
        System.out.println();
    }
    public void cariData(double Data){
        for(int x=0; x<jumlahData; x++){
            if(data[x]==Data){
                System.out.println(Data+" ada di indeks "+x);
                break;
            }
        }
        System.out.println(Data+" tidak ada di larik");
    }
}
