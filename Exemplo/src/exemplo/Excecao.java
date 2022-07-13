package exemplo;

import java.util.Scanner;

public class Excecao 
{

    public void metodoExcecao() throws ArithmeticException, NumberFormatException 
    {
        Scanner ent = new Scanner(System.in);
        int num, deno, resultado;
        System.out.println("Digite o numerador para a divisão:");
        num = Integer.parseInt(ent.nextLine());
        System.out.println("Digite o denominador para a divisão:");
        deno = Integer.parseInt(ent.nextLine());
        resultado = num / deno;
        System.out.println("O resultado da divisão é:" + resultado);
    }
}
