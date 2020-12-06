package tarefa03.entities;

public class CorrencyConverter {

    public static final double IOF = 0.06;

    public static double value;
    public static double dollar;

    public static double conversor() {
        double real = value * dollar;
        return real + (real * IOF);
    }
    
}
