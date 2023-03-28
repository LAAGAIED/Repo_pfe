package ma.pfe.entities;

import javax.persistence.*;

@Entity
public class StudentEntity {
    @Column(name = "name_student")
    private String name;
    @EmbeddedId
    private StudentId studentId;

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
