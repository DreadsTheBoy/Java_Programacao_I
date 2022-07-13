/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo;

/**
 *
 * @author allan
 */
import java.util.Scanner;

public class Excecao2 
{
    public void metodoExcecao() throws ArithmeticException,
            NumberFormatException, IllegalArgumentException 
    {
        Scanner ent = new Scanner(System.in);
        int num, deno, resultado;
        System.out.println("Digite o numerador para a divisão:");
        num = Integer.parseInt(ent.nextLine());
        System.out.println("Digite o denominador para a divisão:");
        deno = Integer.parseInt(ent.nextLine());
        if (deno == 0) 
        {
            throw new IllegalArgumentException("Denominador = 0!");
        }
        resultado = num / deno;
        System.out.println("O resultado da divisão é:" + resultado);
    }
}
