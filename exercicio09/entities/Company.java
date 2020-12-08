package exercicio09.entities;

public class Company extends People {
    
    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double taxPayer() {
        Double sum = 0.0;
        if(numberOfEmployees > 10) {
            sum = anualIncome * 0.14;
        } else {
            sum = anualIncome * 0.16;
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(": $ ");
        sb.append(String.format("%.2f", taxPayer()) + "\n");
        return sb.toString();
    }
}
