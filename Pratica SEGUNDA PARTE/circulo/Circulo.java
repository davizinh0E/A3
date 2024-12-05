package circulo;

import javax.swing.JOptionPane;


public class Circulo {
    //classe que representa um circulo
    private int x, y;
    private double raio, area, perimetro;
    

    public Circulo(int x, int y, double raio, double area, double perimetro){
        this.x = x;
        this.y = y;
        this.raio = raio;
        this.area = area;
        this.perimetro = perimetro;
    }


    public Circulo(int x, int y, double raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
        setArea();
        setPerimetro();
    }


    public Circulo(){
        this.x = 0;
        this.y = 0;
        this.raio = 0;
        setArea();
        setPerimetro();
    }

    
    public void setArea(){
        this.area = Math.PI * Math.pow(raio, 2);
    }


    public double getArea(){
        return area;
    }


    public void setPerimetro(){
        this.perimetro = 2 * Math.PI * raio;
    }


    public double getPerimetro(){
        return perimetro;
    }


    public void moveX(int x1){
        this.x += x1;
    }


    public void moveY(int y1){
        this.y += y1;
    }


    public void aumenta(double n){
        this.raio *= n;
        setArea();
        setPerimetro();
    }


    public void exibe(){
        JOptionPane.showMessageDialog(null,"Propriedades do Círculo instanciado:\nCentro: " + this.x + ", " + this.y + "\nRaio: " + this.raio + "\nÁrea: " + this.area + "\n Perímetro: " + this.perimetro);
    }
}

