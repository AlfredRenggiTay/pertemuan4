/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array.multidimensi;

import java.util.Scanner;

/**
 *
 * @author LAB F
 * TGL 12 April 2025
 */
public class ArrayMultidimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[][] meja = new String[3][2];
        meja[0][0]= "meja A";
        meja[0][1]= "meja B";
        
        meja[1][0]= "meja C";
        meja[1][1]= "meja D";
        
       meja[2][0]= "meja E";
       meja[2][1]= "meja F";
       
       
       Scanner inp = new Scanner (System.in);
       for(int brs=0; brs<3;brs++){
           System.out.printf("baris ke-%d", brs);
           for(int klm=0; klm<2; klm++){
           System.out.printf("kolam ke-%d", klm);
           meja[brs][klm] = inp.nextLine();
       }
       }
        // TODO code application logic here
    }
    
}
