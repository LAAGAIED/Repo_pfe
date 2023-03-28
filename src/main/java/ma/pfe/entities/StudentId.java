package ma.pfe.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StudentId implements Serializable {
    private long id;
    private String code;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentId studentId = (StudentId) o;
        return id == studentId.id && Objects.equals(code, studentId.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code);
    }
}
