package exemplo;

/**
 *
 * @author allan
 */
// Classe Aluno
public class Aluno {

    // declaração e início da classe
    // Atributos devem ser identificados começando por letras minúsculas
    String matricula, nome;
    double cr;

    // Métodos devem ser identificados começando por letras minúsculas
    public void setMatricula(String m) {
        if (!m.isEmpty()) {
            // se o parâmetro m NÃO (!) estiver vazio
            matricula = m;
            // será feita a atribuição
        }
    }

    public String getMatricula() {
        return matricula;
        // retorna a matrícula
    }

    public void setNome(String n) {
        if (!n.isEmpty()) {
            // se o parâmetro n NÃO (!) estiver vazio
            nome = n;
            // será feita a atribuição
        }
    }

    public String getNome() {
        return nome;
        // retorna o nome
    }

    public void setCr(double c) {
        if (c >= 0 && c <= 10) {
            // se o parãmetro c for válido
            cr = c;
            // o valor de c será atribuído
        }

    }

    public double getCr() {
        return cr; // retorna o CR
    }

    // Métodos devem ser identificados começando por letras minúsculas
    public void imprimir() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome : " + nome);
        System.out.println("CR : " + cr);
    }

} // término da classe
