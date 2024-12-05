package circulo;

import javax.swing.JOptionPane;

public class TesteCirculo {

    public static void main(String[] args) {
        String prompt;
        int x = 0, y = 0, interacao = 0;

        JOptionPane.showMessageDialog(null,"Informe as cordenadas do circulo:");
        prompt = JOptionPane.showInputDialog("Informe a posição no eixo das abscissas");
        x = Integer.parseInt(prompt);
        prompt = JOptionPane.showInputDialog("Informe a posição no eixo das ordenadas");
        y = Integer.parseInt(prompt);

        Circulo c =  new Circulo(x, y, 5.0);
    
        do{
        prompt = JOptionPane.showInputDialog("Escolha oque fazer com o círculo: \n1-Mover\n2-Aumentar\n3Imprimir\n4-Sair");
        interacao = Integer.parseInt(prompt);
        
            switch(interacao){
                case 1 :                
                    prompt = JOptionPane.showInputDialog("Quanto mover na direção X?");
                    int moveX = Integer.parseInt(prompt);
                    c.moveX(moveX);  // Mover X
                    prompt = JOptionPane.showInputDialog("Quanto mover na direção Y?");
                    int moveY = Integer.parseInt(prompt);
                    c.moveY(moveY);  // Mover Y
                    break;
                case 2 : 
                    prompt = JOptionPane.showInputDialog("Quanto aumentar o raio?");
                    double aumento = Double.parseDouble(prompt);
                    c.aumenta(aumento);
                    break;
                case 3 : 
                    c.exibe();
                    break;
                case 4 : 
                    JOptionPane.showMessageDialog(null, "Fim do programa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
                    
            }
        }while(interacao != 4);
    }
}
