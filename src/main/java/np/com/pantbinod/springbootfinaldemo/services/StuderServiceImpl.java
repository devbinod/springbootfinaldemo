package np.com.pantbinod.springbootfinaldemo.services;

import np.com.pantbinod.springbootfinaldemo.converter.StudentDtoConverter;
import np.com.pantbinod.springbootfinaldemo.model.dto.StudentDto;
import np.com.pantbinod.springbootfinaldemo.model.entities.Student;
import np.com.pantbinod.springbootfinaldemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuderServiceImpl implements StudentService {

    @Autowired
    private StudentDtoConverter studentDtoConverter;
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentDto save(StudentDto studentDto) {

        return studentDtoConverter.convertEntityToDto(
                studentRepository.saveAndFlush(
                        studentDtoConverter.convertDtoToEntity(studentDto)
                )


        );


     }

    @Override
    public StudentDto update(StudentDto studentDto) {
        return studentDtoConverter.copyConvertEntityToDto(
                studentRepository.saveAndFlush(
                        studentDtoConverter.convertDtoToEntity(studentDto)));
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<StudentDto> findAll() {
        return studentDtoConverter.convertListEntityToDtoList(
                studentRepository.findAll()
        );
    }

    @Override
    public StudentDto findById(Long id) {
        return studentDtoConverter.convertEntityToDto(
                studentRepository.findById(id).get()
        );
    }
}
