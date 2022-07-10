/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo;

import java.util.Scanner;
/**
 *
 * @author allan
 */
public class Exemplo 
{
    
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        double media, nota1, nota2;
        System.out.println("Digite a nota 1:");
        nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a nota 2:");
        nota2 = Double.parseDouble(sc.nextLine());
        media = (nota1+nota2)/2.0;
        System.out.println("A sua Média é: " + media);
        sc.close();
    } 
    
}
