package exercicio07.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    private String name;
    private String email;
    private Date birthDate;

    public Client() {
    }

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Client: " + name + " ");
        sb.append("(" + sdf.format(birthDate) + ") - ");
        sb.append(email + "\n");

        return sb.toString();
    }
    
}
