package exemplo;

import java.util.Scanner;

public class AppTeste 
{
    public static void main(String[] args) 
    {
        Excecao ex = new Excecao();
        try 
        {
            ex.metodoExcecao();
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Execeção gerada:" + e.getMessage());
            System.out.println("Foi gerada uma exceção aritmética, divisão por zero.");
            System.out.println("O denominador não pode ser 0 ( zero ) .");
        } catch (NumberFormatException e) 
        {
            System.out.println("Execeção gerada:" + e.getMessage());
            System.out.println("Foi gerada uma exceção de conversão de dados.");
            System.out.println("Os valores devem ser números inteiros.");
        } catch (Exception e) 
        {
            System.out.println("Outras exceções geradas poderão ser tratadas aqui.");
        }
    }
}
