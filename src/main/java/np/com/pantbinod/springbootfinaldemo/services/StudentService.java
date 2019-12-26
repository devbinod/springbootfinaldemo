package np.com.pantbinod.springbootfinaldemo.services;

import np.com.pantbinod.springbootfinaldemo.model.dto.StudentDto;

public interface StudentService {

     StudentDto save(StudentDto studentDto);
     StudentDto update(StudentDto studentDto);
     void delete(Long id);

}
