/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan24.perbandingannilai;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class IF110119025Latihan24PerbandinganNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        boolean ulangi = true;
        int nilai1 = 5;
        int nilai2 = 5;
        
        System.out.println("========Program Perbandingan Nilai========");
        
        while(ulangi){
            System.out.print("Masukkan Nilai Pertama : ");
            nilai1 = scan.nextInt();
            System.out.print("Masukkan Nilai Kedua : ");
            nilai2 = scan.nextInt();
            if(nilai1 < nilai2){
                  System.out.println("Hasil : " + nilai1 + " Lebih Kecil Dari " + nilai2);
            }else if (nilai1 > nilai2){
                  System.out.println("Hasil : " + nilai1 + " Lebih Besar Dari " + nilai2);
            }else if (nilai1 > nilai2){
                   System.out.println("Hasil : " == nilai1 + " Sama Dengan " + nilai2);
            }
            
             System.out.println("Ulangi Aktivitas ? ");
             String konfirmasi = scan.next();
             if(konfirmasi .equals("Ya")){
                 ulangi = true;
             }else{
                 ulangi = false;
             }
        }
    }
}
           
        
    
    

