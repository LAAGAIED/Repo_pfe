package ma.pfe.services;

import ma.pfe.dtos.StudentDto;

import java.util.List;

public interface IStudentService {

    long save(StudentDto dto);
    long update(StudentDto dto);
    boolean deleteByid(long id);

    List<StudentDto>selectAll();
}
