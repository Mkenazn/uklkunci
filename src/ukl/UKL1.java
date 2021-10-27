/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

//a=suku pertama
//b=selisih antar suku

public class UKL1 {
    public static void main(String[] args){
        int a=11;
        int b=8;
        int awal=19;
        int akhir=29;
        int u= a+ ((awal - 1)*b);
        int s=u;
        
        for(int i = awal; i < akhir; i++){
            System.out.println("suku ke "+ i + "=" + u);
            u = u+b;
            s= s+u;
        
        }
            s= s-u;
            System.out.println();
            System.out.println("Jumlah Deret : "+ s);
    }
}
