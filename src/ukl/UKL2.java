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
public class UKL2 {
 public static void main(String[] args) {
     int a=5;
     int b=5;
     int u=a;
     int s=u;
     
     System.out.println("Deret Aritmatika : ");
     for(int i=0;i<4;i++){
         for(int j=0;j<5;j++){
             System.out.print(u+" ");
             u=u+b;
             s=s+u;
         }
         System.out.println();
     }
             s=s-u;
             System.out.println("Deret Aritmatikanya  "+s);
          
             
 }   
}
