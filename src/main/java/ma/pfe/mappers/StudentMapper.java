package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component(value = "mapper1")
public class StudentMapper {
    public StudentEntity convertDtotoEntity(StudentDto dto) {
        StudentEntity entity = new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }

   public StudentDto convertEntitytoDto(StudentEntity entity) {
        StudentDto dto = new StudentDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }
    public List<StudentDto> studentEntiesToDtos(List<StudentEntity> studentEntities) {
        if(studentEntities!=null&&!studentEntities.isEmpty()){
            return studentEntities.stream().map(entity -> convertEntitytoDto(entity)).collect(Collectors.toList());
        }else {
            return new ArrayList<>();
        }
    }

    public List<StudentEntity> studentDtosToEnties(List<StudentDto> StudentDtos) {
        if(StudentDtos!=null&&!StudentDtos.isEmpty()){
            return StudentDtos.stream().map(dto -> convertDtotoEntity(dto)).collect(Collectors.toList());
        }else {
            return new ArrayList<>();
        }
    }

}
