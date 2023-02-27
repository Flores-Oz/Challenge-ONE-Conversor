/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Oscar
 */
public class Temperatura {
    
    
     public double ConvertirTemperatura(double valor, String conversion){
        double valor2 = 0;    
        switch(conversion){
            case "Celsius a Fahrenheit" -> valor2 = (valor*1.8) + 32 ;
            case "Celsius a Kelvin"-> valor2 = valor + 273.15;
            case "Fahrenheit a Celsius"-> valor2 = (valor-32) / 1.8;
            case "Fahrenheit a Kelvin"-> valor2 = ((5/9)*(valor - 32)) + 273.15 ;
            case "Kelvin a Celsius"-> valor2 = valor - 273.15;
            case "Kelvin a Fahrenheit"-> valor2 = ((valor - 273.15) * (1.8)) + 32;
        }
        return valor2;
    }
}
