package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.IStudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
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
        LOGGER.debug("Star method save dto : {}",dto);
        return mapper.convertEntitytoDto(studentRepository.save(mapper.convertDtotoEntity(dto))).getId();
    }

    @Override
    public long update(StudentDto dto) {LOGGER.debug("Star method update dto : {}",dto);
        return mapper.convertEntitytoDto(studentRepository.save(mapper.convertDtotoEntity(dto))).getId();
    }

    @Override
    public boolean deleteByid(long id) {
        LOGGER.debug("Star method delete id : {}",id); studentRepository.deleteById(id);return true;
    }

    @Override
    public List<StudentDto> selectAll() {
        LOGGER.debug("Star method selectAll");return mapper.studentEntiesToDtos(studentRepository.findAll());
    }
}
