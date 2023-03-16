package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "Repo1")
public class StudentRepositorieImpl implements IStudentRepository {

    private  final static Logger LOGGER= LoggerFactory.getLogger(StudentRepositorieImpl.class);
public StudentRepositorieImpl(){

}
    @Override
    public long save(StudentEntity entity) {
        LOGGER.debug("Star method save");return 0;
    }

    @Override
    public boolean update(StudentEntity entity) {LOGGER.debug("Star method update");
        return false;
    }

    @Override
    public boolean delete(long id) {
        LOGGER.debug("Star method delete");return false;
    }

    @Override
    public List<StudentEntity> selectAll() {
        LOGGER.debug("Star method selecAll");return null;
    }
}
