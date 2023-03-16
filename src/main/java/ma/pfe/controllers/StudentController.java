package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.services.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {
    private  final static Logger LOGGER= LoggerFactory.getLogger(StudentController.class);
    private IStudentService studentService;

    public StudentController(@Qualifier(value = "serv1") IStudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public long save(StudentDto dto){LOGGER.debug("Star method save");
         return studentService.save(dto);
    }

    @PutMapping
    public boolean update(StudentDto dto){
        LOGGER.debug("Star method update");return studentService.update(dto);
    }

    @DeleteMapping
    public boolean delete(long id){
        LOGGER.debug("Star method delete");return studentService.deleteByid(id);
    }

    @GetMapping
    public List<StudentDto> selectAll(){
        LOGGER.debug("Star method selecAll");return studentService.selectAll();
    }
}
