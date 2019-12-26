package np.com.pantbinod.springbootfinaldemo.controller;

import np.com.pantbinod.springbootfinaldemo.model.dto.StudentDto;
import np.com.pantbinod.springbootfinaldemo.model.entities.Student;
import np.com.pantbinod.springbootfinaldemo.repository.StudentRepository;
import np.com.pantbinod.springbootfinaldemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    @PostMapping("/students")
    public void saveStudent(@RequestBody StudentDto studentDto){
        System.out.println( studentService.save(studentDto));;
    }

    @PutMapping("/students/{id}")
    public void updateStudent(@RequestBody StudentDto studentDto, @PathVariable Long id){
       studentDto.setId(id);
        System.out.println(studentDto.toString());
        studentService.save(studentDto);
    }


    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.delete(id);
    }

}
