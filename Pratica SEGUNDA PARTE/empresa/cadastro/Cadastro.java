package empresa.cadastro;

import empresa.pessoa.Funcionario;

/**
 * Classe para gerenciar o cadastro de funcionários.
 */
public class Cadastro{
    private int cont, quantidade;
    private Funcionario[] funcionarios;
    
    /**
     * Construtor para inicializar o cadastro com uma capacidade definida.
     *
     * @param cont       A quantidade total de funcionário cadastrados
     * @param quantidade A quantidade máxima de funcionários que podem ser cadastrados.
     */
    public Cadastro(int quantidade){
        this.cont = 0;
        this.quantidade = quantidade;
        this.funcionarios = new Funcionario[quantidade];
    }
    
     /**
     * Cadastra um novo funcionário, se houver espaço disponível.
     *
     * @param funcionario O funcionário a ser cadastrado.
     */
    public void cadastrar(Funcionario funcionario){
        if (this.cont < quantidade)
            funcionarios[cont++] = funcionario;
        else {
            System.out.println("Capacidade máxima de funcionários cadastrados atingida.");
        }
    }

    /**
     * Retorna uma representação em formato de string de todos os funcionários cadastrados.
     *
     * @return Uma string contendo todos os funcionários cadastrados.
     */
    @Override
    public String toString(){
        StringBuilder mensagem = new StringBuilder("Funcionários Cadastrados:\n");
        for (int i = 0; i < cont; i++) {
            mensagem.append((i + 1)).append(". ").append(funcionarios[i].toString()).append("\n---\n");
        }
            return mensagem.toString();
    }
}
