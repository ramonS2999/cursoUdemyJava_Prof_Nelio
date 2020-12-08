package exercicio08.entities;

public class ImportedProduct extends Product {

    private Double customsFree;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public Double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(Double customsFree) {
        this.customsFree = customsFree;
    }

    public double totalPrice() {
        return price + customsFree;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" $ ");
        sb.append(String.format("%.2f", totalPrice()));
        sb.append(" (Customs free: $ " + String.format("%.2f", customsFree) + ")\n");
        return sb.toString();
    }
    
}
