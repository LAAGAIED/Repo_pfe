package ma.pfe.entities;

import javax.persistence.*;

@Entity
public class StudentEntity {
    @Column(name = "name_student")
    private String name;
    @EmbeddedId
    private StudentId studentId;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "rue", column = @Column(name = "rue_student")),
            @AttributeOverride(name = "avenue", column = @Column(name = "avenue_student")),
            @AttributeOverride(name = "numbre", column = @Column(name = "numbre_student"))
    })
    private Adresse adresse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentId getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentId studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
