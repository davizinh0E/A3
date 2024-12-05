package relogio;



public class Tempo {
    //classe que representa um relogio
    private int hora, minuto, segundo;


    public Tempo(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }


    public Tempo(int h){
        setHora(h);
        this.minuto = 0;
        this.segundo = 0;
    }


    public Tempo(int h, int m){
        setHora(h);
        setMinuto(m);
        this.segundo = 0;
    }

    
    public Tempo(int h, int m, int s){
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    }


    public void setHora(int h){
        //registra o valor de horas
        if ((h>=0)&&(h<24)) hora = h;
        else System.out.println("Horário Inválido!");
    }
    

    public int getHora(){
        return hora;
    }

    public void setMinuto(int m){
        //registra valor de minutos
        if ((m>=0)&&(m<60)) minuto = m;
        else System.out.println("Horário Inválido!");
    }


    public int getMinuto(){
        return minuto;
    }


    public void setSegundo(int s){
        //registra valor de segundos
        if ((s>=0)&&(s<60)) segundo = s;
        else System.out.println("Horário Inválido!");
    }


    public int getSegundo(){
        return segundo;
    }


    public void setTime(int h, int m, int s){
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    }


    public String exibe() {
        // Exibe relógio no formato hh:mm:ss (com zeros à esquerda)
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}