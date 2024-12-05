package banco;

public class ContaCorrente {
    private int numero, agencia;
    private double saldo;
    
    //registra dados da conta do usuario
    public void iniciarContaCorrente(int n, int ag) {
        numero = n;
        agencia = ag;
        saldo = 0;
    }

    //realiza operaçao de saque
    public void sacar(double valor){
        saldo = saldo - valor;
    }

    //realiza operacao de deposito
    public void depositar(double valor){
        saldo = saldo + valor;
    }

    //realiza a operacao vizualizar extrato
    public double consultarSaldo(){
        return (saldo);
    }

    //informa dados da conta do user
    public String exibe() {
        return "Número: " + numero + ", Agência: " + agencia + ", Saldo: " + saldo;
    }
    
}