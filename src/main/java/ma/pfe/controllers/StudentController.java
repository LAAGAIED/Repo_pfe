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
    public long save(@RequestBody StudentDto dto){LOGGER.debug("Start method save dto: {}", dto);
         return studentService.save(dto);
    }

    @PutMapping
    public long update(@RequestBody StudentDto dto){
        LOGGER.debug("Start method update dto: {}", dto);return studentService.update(dto);
    }

    @DeleteMapping("/{ids}")
    public boolean delete(@PathVariable("ids") long id){
        LOGGER.debug("Start method delete id: {}", id);return studentService.deleteByid(id);
    }

    @GetMapping
    public List<StudentDto> selectAll(){
        LOGGER.debug("Star method selecAll");return studentService.selectAll();
    }
}
