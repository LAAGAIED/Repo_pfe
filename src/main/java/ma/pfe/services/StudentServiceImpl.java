package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.IStudentRepository;
import ma.pfe.repositories.StudentRepositorieImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "serv1")
public class StudentServiceImpl implements IStudentService{

    private  final static Logger LOGGER= LoggerFactory.getLogger(StudentServiceImpl.class);
    private IStudentRepository studentRepository;
    private StudentMapper mapper;

    public StudentServiceImpl( @Qualifier(value = "Repo1")IStudentRepository studentRepository,  @Qualifier(value = "mapper1")StudentMapper mapper) {
        this.studentRepository = studentRepository;
        this.mapper = mapper;
    }

    @Override
    public long save(StudentDto dto) {
        LOGGER.debug("Star method save");return studentRepository.save(mapper.convertDtotoEntity(dto));
    }

    @Override
    public boolean update(StudentDto dto) {LOGGER.debug("Star method update");
        return studentRepository.update(mapper.convertDtotoEntity(dto));
    }

    @Override
    public boolean deleteByid(long id) {
        LOGGER.debug("Star method delete");return studentRepository.delete(id);
    }

    @Override
    public List<StudentDto> selectAll() {
        LOGGER.debug("Star method selectAll");return mapper.studentEntiesToDtos(studentRepository.selectAll());
    }
}
