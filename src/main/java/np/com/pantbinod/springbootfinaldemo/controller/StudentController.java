package np.com.pantbinod.springbootfinaldemo.controller;

import np.com.pantbinod.springbootfinaldemo.model.Student;
import np.com.pantbinod.springbootfinaldemo.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {


    private StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/students")
    public List<Student> getAllStudent(@RequestParam(required = false, value = "fname") String firstName,
                                       @RequestParam(required = false,value = "lname") String lastName
                                       ){
        if(firstName!=null) return repository.findByFirstName(firstName);
        else if(lastName!=null) return repository.findByLastName(lastName);
        return repository.findAll();
    }

    @GetMapping(value = "/students/{id}")
    public Optional<Student> getSingleStudent(@PathVariable int id){
        return repository.findById(id);
    }

    @PostMapping(value = "/students")
    public void getAllStudent(@RequestBody Student student){
        repository.saveAndFlush(student);
    }


    @PutMapping(value = "/students/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student student){
        System.out.println("id");
        System.out.println(student.toString());
        student.setId(id);
        repository.saveAndFlush(student);
    }


    @DeleteMapping(value = "/students/{id}")
    public void deleteStudent(@PathVariable int id){
      repository.deleteById(id);
    }




}
