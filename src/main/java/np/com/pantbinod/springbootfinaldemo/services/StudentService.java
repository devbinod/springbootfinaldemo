package np.com.pantbinod.springbootfinaldemo.services;

import np.com.pantbinod.springbootfinaldemo.model.dto.StudentDto;

import java.util.List;

public interface StudentService {

     StudentDto save(StudentDto studentDto);
     StudentDto update(StudentDto studentDto);
     void delete(Long id);
     List<StudentDto> findAll();
     StudentDto findById(Long id);

}
