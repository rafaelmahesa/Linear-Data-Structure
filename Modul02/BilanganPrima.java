/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul02;

/**
 *
 * @author Rafael Mahesa
 */
import java.util.Scanner;
public class BilanganPrima {
    static int cekPrima(int i,int num){
	    if(num==i)
	        return 0;
            else if(num%i==0)
	        return 1;
	    else
	        return cekPrima(i+1,num);
    }
    public static void main(String[] args) {
            int n;
            Scanner key = new Scanner(System.in);
            
	    System.out.print("Masukkan Nilai N: ");
	    n = key.nextInt();
	    System.out.print("Bilangan Prima dari 1 sampai "+n+" adalah; ");
	    for(int i=2;i<=n;i++)
                if(cekPrima(2,i)==0)
                    System.out.print(i+" ");
    }
}
