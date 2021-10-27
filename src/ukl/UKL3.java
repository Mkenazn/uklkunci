/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

/**
 *
 * @author 62822
 */
public class UKL3 {
   public static void main(String[] args) {
        int nilaipertama = 16;
        int selisih = 5;
        int sukusaatini = nilaipertama; //16+5+5+5+5+5
        int total = nilaipertama;
        
        System.out.println("Deret Aritmatika :");
        for(int i = 0; i < 4; i++) { //baris
            for(int j = 0; j <4-i; j++) { //kolom
            System.out.print(sukusaatini + "\t");
            sukusaatini=sukusaatini + selisih;
            }
            
            System.out.println();
        //bila segitiga siku2 hanya diminta 1, hapus bawah dan ganti 4-1 jadi <=i
        }
         for(int i = 0; i < 4; i++) { //baris
            for(int j = 0; j <1+i; j++) { //kolom
                System.out.print(sukusaatini + "\t");
            sukusaatini=sukusaatini + selisih;
            
            }
        System.out.println();
            }
         }
}   
