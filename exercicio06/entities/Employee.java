package exercicio06.entities;

public class Employee {
 
    private Integer id;
    private String name;
    private Double salario;

    public Employee(Integer id, String name, Double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }
    
    public void almentoDeSlaarioPorcentagem(Double porcentagem) {
        salario += (salario * porcentagem / 100);
    }

    @Override
    public String toString() {
        return getId() + ", " + getName() + ", " + String.format("%.2f", getSalario());
    }
}
