package tarefa10.entities;

import tarefa10.entities.enums.Color;

public class Circle extends Shape {
    
    private Double radius;

	public Circle() {
        super();
	}

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadio() {
        return radius;
    }

    public void setRadio(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + " " + String.format("%.2f", area());
    }

    

}
