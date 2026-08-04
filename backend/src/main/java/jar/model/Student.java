//model/Student.java 
package jar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    @Column(unique = true)
    String email;
    String ip;

    public void setName(String n) {
        this.name = n;
    }

    public void setEmail(String e) {
        this.email = e;

    }

    public void setIp(String ip) {

        this.ip = ip;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getIp() {
        return this.ip;
    }

}
