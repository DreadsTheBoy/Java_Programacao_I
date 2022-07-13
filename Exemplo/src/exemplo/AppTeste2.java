package exemplo;

import java.util.Scanner;

public class AppTeste2 {

    public static void main(String[] args) 
    {
        Excecao2 ex = new Excecao2();
        try 
        {
            ex.metodoExcecao();
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Execeção gerada: " + e.getMessage());
            System.out.println("Foi gerada uma exceção aritmética, divisão por zero.");
            System.out.println("O denominador não pode ser 0 ( zero ) .");
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Execeção gerada: " + e.getMessage());
            System.out.println("Foi gerada uma exceção de conversão de dados.");
            System.out.println("Os valores devem ser números inteiros.");
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Execeção gerada: " + e.getMessage());
            System.out.println("Foi gerada uma exceção através do código porque o ");
            System.out.println("denominador era igual a 0(zero).");
        } catch (Exception e) 
        {
            System.out.println("Outras exceções geradas poderão ser tratadas aqui.");
        }
    }
}
