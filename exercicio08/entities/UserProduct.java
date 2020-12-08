package exercicio08.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserProduct extends Product {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private Date manufatureDate;

    public UserProduct() {
        super();
    }

    public UserProduct(String name, Double price, Date manufatureDate) {
        super(name, price);
        this.manufatureDate = manufatureDate;
    }

    public Date getManufatureDate() {
        return manufatureDate;
    }

    public void setManufatureDate(Date manufatureDate) {
        this.manufatureDate = manufatureDate;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" (used) $ ");
        sb.append(String.format("%.2f", price));
        sb.append(" (Manufature date: ");
        sb.append(sdf.format(manufatureDate) + ")\n");
        return sb.toString();
    }
}
