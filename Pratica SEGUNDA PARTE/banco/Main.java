package banco;

import javax.swing.JOptionPane;


public class Main {
    //realiza operacoes em uma conta corrente
    public static void main(String[] args) {
        String prompt;
        int numero, agencia;
        double deposito, saque;

        ContaCorrente contaCorrente;
        contaCorrente = new ContaCorrente();
        
        //requerimento de dados do usuario
        JOptionPane.showMessageDialog(null,"Informe seu número e agência.");
        prompt = JOptionPane.showInputDialog("Número: ");
        numero = Integer.parseInt(prompt);
        prompt = JOptionPane.showInputDialog("Agência: ");
        agencia = Integer.parseInt(prompt);

        contaCorrente.iniciarContaCorrente(numero, agencia);
        
        JOptionPane.showMessageDialog(null, "\nSaldo: " + contaCorrente.consultarSaldo());

        //registra valor a ser depositado
        prompt = JOptionPane.showInputDialog("Insira o valor a ser depositado.");
        deposito = Double.parseDouble(prompt);
        
        contaCorrente.depositar(deposito);
        
        JOptionPane.showMessageDialog(null, contaCorrente.exibe());
        
        //registra valor a ser sacado
        prompt = JOptionPane.showInputDialog("Insira o valor que deseja sacar.");
        saque = Double.parseDouble(prompt);

        //checa se há saldo suficiente para ser sacado na conta do user
        while(saque > contaCorrente.consultarSaldo()){
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente! Seu saldo é de " + contaCorrente.consultarSaldo());

            prompt = JOptionPane.showInputDialog("Insira o valor que deseja sacar.");
            saque = Double.parseDouble(prompt);
        }
        
        contaCorrente.sacar(saque);
        
        //confirma saque e mostra dados atualizados da conta
        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! Confira os dados atualizados de sua conta.");
        JOptionPane.showMessageDialog(null, contaCorrente.exibe());
    }
}
