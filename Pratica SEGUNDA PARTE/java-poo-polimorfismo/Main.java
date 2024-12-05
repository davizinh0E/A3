import cadastro.Cadastro;
import pessoa.PessoaFisica;

public class Main{
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(3);
        PessoaFisica pessoaFisica = new PessoaFisica("1", "Davi");
        PessoaFisica pessoaFisica2 = new PessoaFisica("2", "Rafa");
        PessoaFisica pessoaFisica3 = new PessoaFisica("3", "Rick");

        cadastro.cadastrar(pessoaFisica);
        cadastro.cadastrar(pessoaFisica2);
        cadastro.cadastrar(pessoaFisica3);

        System.out.println(cadastro);
    }
}