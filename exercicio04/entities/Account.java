package exercicio04.entities;

public class Account {

    private static final double TAX = 5.0;
    
    private String name;
    private int number;
    private double saldo;

    public Account() {

    }

    public Account(String name, int number, double saldo) {
        this.name = name;
        this.number = number;
        depositar(saldo);
    }

    public Account(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        saldo -= valor + TAX;
    }

    public String toString() {
        return "Account " + number + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", saldo);
    }
}
