package np.com.pantbinod.springbootfinaldemo.converter;

import np.com.pantbinod.springbootfinaldemo.common.BaseConverter;
import np.com.pantbinod.springbootfinaldemo.model.dto.StudentDto;
import np.com.pantbinod.springbootfinaldemo.model.entities.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentDtoConverter extends BaseConverter<Student, StudentDto>  {


    @Override
    public StudentDto convertEntityToDto(Student entity) {

        if(entity == null) return null;
        StudentDto studentDto = copyConvertEntityToDto(entity);
        return studentDto;
    }

    @Override
    public Student convertDtoToEntity(StudentDto dto) {

        if(dto ==  null) return null;
        return copyConvertDtoToEntity(dto);

    }

    @Override
    public Student copyConvertDtoToEntity(StudentDto dto) {
        Student student = new Student();
        student.setFirstName(dto.getFirstName());
        student.setMiddleName(dto.getMiddleName());
        student.setLastName(dto.getLastName());
        student.setRollNo(dto.getRollNo());
        student.setAddress(dto.getAddress());
        return student;


    }

    private String getFullName(String fname, String mname,String lname){
        String str = fname;
        if(mname!=null){
            str.concat(" ").concat(mname);
        }
        str.concat(" ").concat(lname);
        return str;
    }

    @Override
    public StudentDto copyConvertEntityToDto(Student entity) {

        StudentDto studentDto = new StudentDto();
        studentDto.setFirstName(entity.getFirstName());
        studentDto.setMiddleName(entity.getMiddleName());
        studentDto.setLastName(entity.getLastName());
        studentDto.setFullName(getFullName(entity.getFirstName(),entity.getMiddleName(),entity.getLastName()));
        studentDto.setRollNo(entity.getRollNo());
        studentDto.setAddress(entity.getAddress());
        return studentDto;
    }
}
