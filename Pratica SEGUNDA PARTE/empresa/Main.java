package empresa;

import empresa.cadastro.Cadastro;
import empresa.pessoa.Funcionario;

/**
 * Classe principal para executar o sistema de cadastro de funcionários.
 */
public class Main{

    /**
     * Método principal para executar o programa.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(3);
        Funcionario funcionario = new Funcionario("Davi", "Software Engineer", "Belorihills", 20000, "(31)998808731", 20);
        Funcionario funcionario2 = new Funcionario("Rafa", "Cuidadora de Idosos", "Jhama", 1400, "(31)96668666", 19);
        Funcionario funcionario3 = new Funcionario("Rick", "Senior Software Engineer", "Jabo", 40000, "(12)12345678", 28);

        cadastro.cadastrar(funcionario);
        cadastro.cadastrar(funcionario2);
        cadastro.cadastrar(funcionario3);

        System.out.println(cadastro);
    }
}
