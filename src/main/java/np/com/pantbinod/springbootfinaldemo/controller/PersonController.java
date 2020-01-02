package np.com.pantbinod.springbootfinaldemo.controller;

import np.com.pantbinod.springbootfinaldemo.model.entities.Person;
import np.com.pantbinod.springbootfinaldemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons")
    public List<Person> getAll(){
        return personRepository.findAll();
    }

    @PostMapping("/persons")
    public void getAll(@RequestBody Person person){

    personRepository.save(person);
    }
}
