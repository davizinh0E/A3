package concecionaria;

/*
 * Classe para gerenciar cadastros de carros em uma concecionaria
 */
public class Cadastro {
    private int cont, quantidade;
    private Veiculo[] veiculos;

    public Cadastro(int quantidade){
        this.cont = 0;
        this.quantidade = quantidade;
        this.veiculos = new Veiculo[quantidade];
    }


    public void cadastrar(Veiculo veiculo){
        if (veiculo == null) {
            System.out.println("Erro: Não é possível cadastrar um veículo nulo.");
            return;
        }
        if (this.cont < quantidade){
            this.veiculos[cont++] = veiculo;
        }
        else {
            System.out.println("Capacidade máxima de veículos cadastrados atingida.");
        }
    }

    @Override
    public String toString(){
        StringBuilder mensagem = new StringBuilder("Carros Cadastrados:\n");
        for (int i = 0; i < cont; i++){
            mensagem.append((i + 1)).append(". ").append(veiculos[i].toString()).append("\n---\n");
        }
            return mensagem.toString();
    }
}
