package exercicio07.entities;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = product.getPrice();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public double subTotal() {
        return quantity * price;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(product.getName() + ", $");
        sb.append(String.format("%.2f", product.getPrice()) + ", ");
        sb.append("Quantity: " + quantity + ", ");
        sb.append("Subtotal: $" + String.format("%.2f", subTotal()) + "\n");

        return sb.toString();
    }
}
