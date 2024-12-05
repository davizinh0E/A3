package empresa.pessoa;

/**
 * Representa um funcionário com informações pessoais e profissionais.
 */
public class Funcionario{
    private String nome;    
    private String cargo;
    private String endereco;
    private double salario;
    private String telefone;
    private int idade;
    
    /**
         * metodo contrutor para criar um novo funcionário
         * 
         * @param nome     O nome do funcionário
         * @param cargo    O cargo do funcionário
         * @param endereço O endereço do funcionário
         * @param salario  O salario do funcionario
         * @param telefone O telefone do funcionário
         * @param idade    A idade do funcionario
         */
    public Funcionario(String nome, String cargo, String endereco, double salario, String telefone, int idade){
        
        this.nome = nome;
        this.cargo = cargo;
        this.endereco = endereco;
        this.salario = salario;
        this.telefone = telefone;
        this.idade = idade;
    }
    
    /**retorna uma representação em formato de string de um funcionario.
         * 
         * @return Uma string contendo informaçoes de um funcionario
         */
    @Override
    public String toString(){
        
        return "Nome: " + this.nome + ", Cargo: " + this.cargo + ", Endereço: " + this.endereco + ", Salário: " + this.salario + ", Telefone: " + this.telefone + ", Idade: " + this.idade;
    }
}