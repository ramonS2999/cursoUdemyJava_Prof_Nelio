package exercicio03.entities;

public class Aluno {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double somaDasNotas() {
        return nota1 + nota2 + nota3;
    }

    public double porcentagem() {
        return 100 * 0.6;
    }

    public boolean aprovadoReprovado() {
        return somaDasNotas() >= porcentagem() ? true : false;
    }

    public double pontosFaltantentes() {
        return 60 - somaDasNotas();
    }

    public String toString() {
        return aprovadoReprovado() ? "FINAL GRANDE = " + String.format("%.2f", somaDasNotas()) + "\nPASS" : 
                                      "FINAL GRAND = " + String.format("%.2f", somaDasNotas()) + "\nFAILED" +
                                      "\nMISSING " + String.format("%.2f", pontosFaltantentes()) + " POINTS";
    }
    
}
