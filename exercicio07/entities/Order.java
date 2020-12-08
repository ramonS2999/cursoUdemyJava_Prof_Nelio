package exercicio07.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercicio07.entities.enem.OrderStatus;

public class Order {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private List<OrderItem> orderItem = new ArrayList<>();
    private Client client;

    public Order() {
    }

    public Order(OrderStatus status, Client client) {
        this.moment = new Date();
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getAtatus() {
        return status;
    }

    public void setAtatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        orderItem.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItem.remove(item);
    }

    public double total() {
        Double sum = 0.0;
        for (OrderItem c : orderItem) {
            sum += c.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append(client);
        sb.append("Order items:\n");
        for (OrderItem c : orderItem) {
            sb.append(c);
        }
        sb.append("Total price: $" + total() + "\n");

        return sb.toString();
    }
    
}
