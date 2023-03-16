package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface IStudentRepository {
    long save(StudentEntity entity);
    boolean update(StudentEntity entity);
    boolean delete(long id);

    List<StudentEntity> selectAll();
}
