package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("Repo1")
public interface IStudentRepository extends JpaRepository<StudentEntity,Long> {

}
