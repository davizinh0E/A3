package cadastro;

import pessoa.PessoaFisica;

public class Cadastro{
    int cont, quantidade;
    PessoaFisica[] pessoas;

    public Cadastro(int quantidade){
        this.cont = 0;
        pessoas = new PessoaFisica[quantidade];
    }


    public void cadastrar(PessoaFisica pessoaFisica){
        if (this.cont < quantidade)
            pessoas[cont++] = pessoaFisica;
    }


    public String toString(){
        String mensagem = "Pessoas Cadastradas: \n";
        for(PessoaFisica pessoaFisica : pessoas)
            mensagem += pessoaFisica.toString() + "\n";
        return mensagem;
    }
}