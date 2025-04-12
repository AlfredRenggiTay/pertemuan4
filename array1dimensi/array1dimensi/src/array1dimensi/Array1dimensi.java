/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1dimensi;

import java.util.Scanner;

/**
 *
 * @author LAB F
 * TGL 12 April 2025
 */
public class Array1dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] NMA = new String[5];
        
        NMA[0]="Johan";
        NMA[1]="wati";
        NMA[2]="sukareni";
        NMA[3]="Warsito";
        NMA[4]="Sugeng";
        
        Scanner inp = new Scanner(System.in);
        
            System.out.println("~~~~~Input data ke array~~~~~");
            for(int idx=0; idx<5; idx++ ){
            NMA[idx] = inp.nextLine();
            
        }
        System.out.println("~~~~output data ke array~~~~~");
         for(int idx=0; idx<5; idx++ ){
      System.out.println("Data Nama Pengunjung ke-"+(idx+1)+": "+NMA[idx]);
         }
      
      
      System.out.println("~~~~~Output2 Data ke array~~~~~");
      int no=1;
      for(String isi :NMA){
          System.out.println(no+". "+isi);
          no++;
      }
            
        }
         
        
       
        // TODO code application logic here
    }
    

