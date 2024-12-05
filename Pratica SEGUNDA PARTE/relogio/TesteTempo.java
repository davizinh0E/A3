package relogio;

public class TesteTempo {
    public static void main(String[] args) {
        Tempo t1 = new Tempo(); 
        Tempo t2 = new Tempo(12); 
        Tempo t3 = new Tempo(14, 30);
        Tempo t4 = new Tempo(16, 45, 59);

        System.out.println("Tempo 1: " + t1.exibe());
        System.out.println("Tempo 2: " + t2.exibe());
        System.out.println("Tempo 3: " + t3.exibe());
        System.out.println("Tempo 4: " + t4.exibe());
    }
}

