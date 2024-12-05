package concecionaria;

/*
 * Classe que instancia veículos
 */
public class Veiculo {
    private String marca, modelo, cor, placa;
    private Integer chassi;

    public Veiculo(String marca, String modelo, String cor, String placa, Integer chassi){
        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setPlaca(placa);
        setChassi(chassi);
    }

    public String getMarca(){
        return marca;
    }
    

    public void setMarca(String marca){
        if (marca != null && !marca.isEmpty()) // Validacao
            this.marca = marca;
    }


    public String getModelo(){
        return modelo;
    }
    

    public void setModelo(String modelo){
        if (modelo != null && !modelo.isEmpty())
            this.modelo = modelo;
    }


    public String getCor(){
        return cor;
    }
    

    public void setCor(String cor){
        if (cor != null && !cor.isEmpty()) // Validacao
            this.cor = cor;
    }


    public Integer getChassi(){
        return chassi;
    }
    

    public void setChassi(Integer chassi){
        if (chassi != null && chassi > 0) {  // validacao de numero positivo
            this.chassi = chassi;
        } else {
            System.out.println("O número do chassi deve ser positivo.");
        }
    }


    public String getPlaca(){
        return placa;
    }
    

    public void setPlaca(String placa){
        if (placa != null && !placa.isEmpty())
            this.placa = placa;
    }


    @Override
    public String toString(){
        return "Marca: " + this.marca + ", Modelo: " + this.modelo + ", Cor:" + this.cor + ", Placa: " + this.placa + ", Chassi: " + this.chassi;
    }
}
