package exemplo;

import java.util.Scanner;

public class MassaCorporal 
{

    public static void main(String[]args)
    {
        
        Scanner sc = new Scanner(System.in);
        double peso, alt, imc;
        System.out.println("Digite Seu Peso: ");
        peso = Double.parseDouble(sc.nextLine());
        System.out.println("Digite Sua Altura: ");
        alt = Double.parseDouble(sc.nextLine());
        imc = peso/(alt*alt);
        System.out.println("Seu IMC é: " + imc);
        //Analisando o resultado do IMC
        if (imc < 18.5)
        {
            System.out.println("Você esta Abaixo do Peso!!!");
        }
        else if (imc < 25)
        {
            System.out.println("Você esta no Peso Ideal!!!");
        }
        else if (imc < 30)
        {
            System.out.println("Você esta com sobrepeso!!!");
        }
        else if (imc < 35)
        {
            System.out.println("Você esta com Obesidade Grau I!!!");
        }
        else if (imc < 40)
        {
            System.out.println("Você esta com Obesidade Grau II!!!");
        }
        else
        {
            System.out.println("Você esta com Obesidade Grau III!!!");
        }   

    }
        
}
