/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangkaian.seri.pareral.luthfi;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class RangkaianSeriPareralLuthfi {
private static double Seri(double R1,double R2,double R3){
        return (R1+R2+R3);
    }
    private static double Paralel (double R1,double R2,double R3){
        return (1/(1/R1)+(1/R2)+(1/R3));
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner Baca = new Scanner(System.in);
        double R1,R2,R3;
        System.out.print("Hambatan 1 = "); R1=Baca.nextDouble();
        System.out.print("Hambatan 2 = "); R2=Baca.nextDouble();
        System.out.print("Hambatan 3 = "); R3=Baca.nextDouble();
        System.out.println("Seri = "+Seri(R1,R2,R3));
        System.out.println("Paralel = "+Paralel(R1,R2,R3));
    }
    
}
