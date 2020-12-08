package exercicio09.entities;

public class Individual extends People {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }
    
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }
    
    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    
    @Override
    public double taxPayer() {
        Double sum = 0.0;
        if(anualIncome < 20000.00) {
            sum = anualIncome * 0.15 - healthExpenditures * 0.5;
        } else {
            sum = anualIncome * 0.25 - healthExpenditures * 0.5;
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
