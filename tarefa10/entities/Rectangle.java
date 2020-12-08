package tarefa10.entities;

import tarefa10.entities.enums.Color;

public class Rectangle extends Shape {
    
    private Double widht;
    private Double height;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color,  Double widht, Double height) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    public Double getWidht() {
        return widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return widht * height;
    }

    @Override
    public String toString() {
        return super.toString() + " " + String.format("%.2f", area());
    }
}
