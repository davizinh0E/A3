package pratica12pt2;

public class Retangulo {
    //classe que instancia um retangulo
    private float altura, largura;
    
    //metodo construtor que inicializa valores
    public Retangulo() {
    altura = 0;
    largura = 0;
    }

    //obtem valor altura
    public float getAltura() {
        return (altura);
    }

    //registra valor altura
    public void setAltura(float alt) {
        altura = alt;
    }

    //obtem valor altura
    public float getLargura() {
        return (largura);
    }

    //registra valor altura
    public void setLargura(float larg) {
        largura = larg;
    }

    //calcula area apartir dos valores registrados
    public float calculaArea() {
        return altura * largura;
    }

    //calcula perimetro apartir de valores registrados
    public float calculaPerimetro() {
        return 2 * altura + 2 * largura;
    }

    //exibe informacoes do objeto instanciado
    public String exibe() {
        return "Altura: " + altura + ", Largura: " + largura + ", Área: " + calculaArea() + ", Perímetro: " + calculaPerimetro() +".";
    }
}