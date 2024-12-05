package concecionaria;



public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(3);
        Veiculo veiculo = new Veiculo("Tesla", "Model Y", "Azul", "FCKK-505", 123456789);
        Veiculo veiculo2 = new Veiculo("Jeep", "Commander", "Preto", "G4Y-DM55", 987654321 );
        Veiculo veiculo3 = new Veiculo("Fiat", "Siena", "Cinza", "S1ND-456", 132457689);

        cadastro.cadastrar(veiculo);
        cadastro.cadastrar(veiculo2);
        cadastro.cadastrar(veiculo3);

        System.out.println(cadastro);

    }
}
