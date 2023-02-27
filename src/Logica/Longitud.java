/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Oscar
 */
public class Longitud {

    public double ConvertirLongitud(double valor, String conversion){
        double valor2 = 0;    
        switch(conversion){
            case "Kilometro a Metro" -> valor2 = valor * 1000 ;
            case "Kilometro a Centimetro" -> valor2 = valor * 100000  ;
            case"Kilometro a Milimetro"-> valor2 = valor * 1e+6;
            case"Metro a Kilometro"-> valor2 = valor / 1000 ;
            case"Metro a Centimetro"-> valor2 = valor * 100 ;
            case"Metro a Milimetro"-> valor2 =  valor * 1000;
            case"Centimetro a Kilometro"-> valor2 = valor / 100000;
            case"Centimetro a Metro"-> valor2 = valor / 100;
            case"Centimetro a Milimetro"-> valor2 = valor * 10;
        }
        return valor2;
    }
}
