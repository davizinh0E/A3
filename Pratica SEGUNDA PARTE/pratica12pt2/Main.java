package pratica12pt2;

import java.util.Scanner;

public class Main {

    public static void main(String Args[]) {

        Retangulo ret = new Retangulo();

        Scanner input = new Scanner(System.in);
        
        //requer valor para variavel altura
        System.out.print("Informe a altura do retângulo: ");

        ret.setAltura(input.nextFloat());

        //requer valor para variavel largura
        System.out.print("Informe a largura do retângulo: ");

        ret.setLargura(input.nextFloat());

        //exibe dados do retangulo instanciado
        System.out.println("A area é: " + ret.calculaArea());
        System.out.println("O perimetro é: " + ret.calculaPerimetro());
    }
}
