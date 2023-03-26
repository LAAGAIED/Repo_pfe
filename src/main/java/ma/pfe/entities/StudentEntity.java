package ma.pfe.entities;

import javax.persistence.*;

@Entity
public class StudentEntity {
    @Column(name = "name_student")
    private String name;
    @Id
    @Column(name="id_student")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
