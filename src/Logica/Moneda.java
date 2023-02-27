/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Oscar
 */
public class Moneda {
    double dolar1 = 0.13;
    double euro1 = 0.12;
    double libra1 = 0.11;
    double yen1 = 17.50;
    double won1 = 168.54;
    double pesos1 = 2.36;
    double quetzal1 = 7.81;
    double quetzal2 = 8.25;
    double quetzal3 = 9.32;
    double quetzal4 = 0.057;
    double quetzal5 = 0.0059;
    double quetzal6 = 0.42;
    
    public double ConvertirMoneda(double valor, String conversion){
        double valor2 = 0;    
        switch(conversion){
            case "De Quetzales a Dólar" -> valor2 = valor * dolar1;
            case "De Quetzales a Euros" -> valor2 = valor * euro1;
            case "De Quetzales a Libras" -> valor2 = valor * libra1;
            case "De Quetzales a Yen" -> valor2 = valor * yen1;
            case "De Quetzales a Won Coreano" -> valor2 = valor * won1;
            case "De Quetzales a Pesos" -> valor2 = valor * pesos1;
            case "De Dólar a Quetzales" -> valor2 = valor * quetzal1;
            case "De Euros a Quetzales" -> valor2 = valor * quetzal2;
            case "De Libras a Quetzales" -> valor2 = valor * quetzal3;
            case "De Yen a Quetzales" -> valor2 = valor * quetzal4;
            case "De Won Coreano a Quetzales" -> valor2 = valor * quetzal5;
            case "De Pesos a Quetzales " -> valor2 = valor * quetzal6;
        }
        return valor2;
    }
}
