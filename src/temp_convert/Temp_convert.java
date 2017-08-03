/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp_convert;

/**
 *
 * @author Victor Morgant
 */
import java.util.Scanner;
public class Temp_convert {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char mode, cont;
        double celsius,kelvin,fahrenheit;
        
        System.out.println("     Temperature Converter     ");
        System.out.println("-------------------------------------------------");
        
        do{
            mode=' ';
            while(mode!='f' && mode!='k' && mode !='c') {
                System.out.println("Your current unit?");
                System.out.println("f : Fahrenheit;");
                System.out.println("c: Celsius");
                System.out.println("k : Kelvin");
                mode = sc.nextLine().charAt(0);
            }
            
            System.out.println("Your temperature?");
            switch(mode){
                
                case 'f' : fahrenheit = sc.nextDouble();
                    sc.nextLine();
                    celsius=round(Fahrenheit_Celsius(fahrenheit),3);
                    kelvin=round(Fahrenheit_Kelvin(fahrenheit),3);
                    System.out.println(fahrenheit+"°F is");
                    System.out.println(celsius+"°C ");
                    System.out.println(kelvin+"K ");
                    break;
                    
                case 'c' : celsius = sc.nextDouble();
                    sc.nextLine();
                    fahrenheit=round(Celsius_Fahrenheit(celsius),3);
                    kelvin=round(Celsius_Kelvin(celsius),3);
                    System.out.println(celsius+"°C is");
                    System.out.println(fahrenheit+"°F ");
                    System.out.println(kelvin+"K ");
                    break;
                    
                case 'k' : kelvin = sc.nextDouble();
                    celsius=round(Kelvin_Celsius(kelvin),3);
                    fahrenheit=round(Fahrenheit_Celsius(kelvin),3);
                    System.out.println(kelvin+"K is");
                    System.out.println(celsius+"°C ");
                    System.out.println(fahrenheit+"°F ");
                    break;
            }
            do{
                System.out.println("Other conversion ? (Y/N)");
                cont = sc.nextLine().charAt(0);
            }while (cont != 'Y' &&cont !='N');
        }while(cont== 'Y');
            System.out.println("Good Bye !)");
        
    }
    public static double round(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }
    public static double Celsius_Fahrenheit(double C) {
        return (double) ( 1.8 *C+32) ;
    }
    public static double Celsius_Kelvin(double C) {
        return (double) ( C+273.15) ;
    }
     public static double Fahrenheit_Celsius(double F) {
        return (double) ( (F-32)/1.8) ;
    }
    public static double Fahrenheit_Kelvin(double F) {
        return (double) ( (F+459.67)/1.8) ;
    }
    public static double Kelvin_Fahrenheit(double K) {
        return (double) ( K*1.8-459.67) ;
    }
    public static double Kelvin_Celsius(double K) {
        return (double) ( K-273.15) ;
    }
}
