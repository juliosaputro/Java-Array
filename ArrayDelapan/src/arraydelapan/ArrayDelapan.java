/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydelapan;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ArrayDelapan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       int[] data ={1,5,10,15,20};
       
       System.out.println("Data Pertama adalah "+data[0]);
       System.out.println("Data Pertama adalah "+data[1]);
       System.out.println("Data Pertama adalah "+data[2]);
       System.out.println("Data Pertama adalah "+data[3]);
       System.out.println("Data Pertama adalah "+data[4]);
       
       System.out.println("==================");
       for(int i=0;i<data.length;i++){
           System.out.print(data[i]+" ");
       }
       
       for(int i=0;i<5;i++){
           System.out.print(data[i]+" ");
       }
       
       for(int i=0;i<=4;i++){
           System.out.print(data[i]+" ");
       }
         String[][] nama={
             {"Julio","Ricky","Saputro"},
             {"Algoritma", "dan", "Struktur Data"},
             {"Sistem Informasi", "dan", "Informasi"}
         };
         
         System.out.println(nama[0][2]);
         System.out.println(nama[0][0]+" "+nama[2][0]);
         System.out.println("==================");
         
         for(int baris=0;baris<nama.length;baris++){
             for(int kolom=0;kolom<nama.length;kolom++){
                 System.out.print(nama[baris][kolom]);
             }
             System.out.println(" ");
         }
         System.out.println("==================");
         
         int[][] bilangan={
             {1,2,3},
             {4,5,6},
             {7,8,9}
         };
         
         for(int baris=0;baris<3;baris++){
             for(int kolom=0;kolom<3;kolom++){
                 System.out.print(bilangan[baris][kolom]);
             }
             System.out.println(" ");
         }
         System.out.println("==================");
         
         Scanner scan = new Scanner(System.in);
         System.out.print("Masukkan Jumlah Kota yang ingin diinputkan : ");
         int jumlah=scan.nextInt();
         
         String kota[]=new String[jumlah];
         for(int i=0;i<kota.length;i++){
             System.out.print("Masukkan Nama Kota ke"+(i+1)+" = ");
             kota[i]=scan.next();
         }
         for(int i=0;i<kota.length;i++){
             System.out.println("Kota yang Diinputkan Adalah "+kota[i]);
             
         }
       System.out.println("==============================================");
       System.out.println("================ Tugas Array =================");
       System.out.println("===================== 01 =====================");

       Scanner baca = new Scanner(System.in);

       int i, n, jumlah, a, rata;

       System.out.print("Masukkan banyak angka yang ingin diinputkan: ");
       n = baca.nextInt();
       jumlah = 0;
       i = 1;
       while (i <= n) {
           System.out.print("Data ke-" + (i) + "= ");
           a = baca.nextInt();
           jumlah += a;
           i++;
       }

       rata = jumlah / n;
       System.out.println("Banyak Bilangan:  " + n);
       System.out.println("jumlah:  " + jumlah);
       System.out.println("Rata-rata:  " + rata);
       
        System.out.println("==============================================");
        System.out.println("================ Tugas Array =================");
        System.out.println("===================== 02 =====================");
        
        Scanner baca = new Scanner(System.in);
        
         System.out.println(" ");
        System.out.print("Banyak data mahasiswa yang ingin diinputkan: ");
        int a = baca.nextInt();
        
        String data[][] = new String[a][3];
        
        for(int i=0; i<a; i++){
            System.out.println(" ");
            System.out.println("Data ke-" + (i+1) + "= ");
            
            for(int x=0;x<3;x++){
                if(x == 0 )
                    System.out.print("Nama : ");
                else if (x == 1)
                    System.out.print("NIM : ");
                else
                    System.out.print("Prodi : ");
                
                System.out.print(" ");
                data[i][x]=baca.next();
            }
        }
        
        System.out.println("================ Data Mahasiswa =================");
        System.out.println("=================================================");
        System.out.println("Nama \t\t  NIM \t\t\t  Prodi \t");
        
        for (int i=0; i<a; i++){
            for(int x=0; x<3; x++){
                System.out.print(data[i][x]+"\t\t");
            }
            System.out.println();
        }
        
        
    }

}
