package spr;

import jakarta.persistence.*;

@Entity
@Table(name = "\""+"User"+"\"")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fio;
    private String email;
    private String phone;

    public User(String fio, String email, String phone) {
        this.fio = fio;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
