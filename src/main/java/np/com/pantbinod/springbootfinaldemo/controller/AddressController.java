package np.com.pantbinod.springbootfinaldemo.controller;

import np.com.pantbinod.springbootfinaldemo.model.entities.Address;
import np.com.pantbinod.springbootfinaldemo.model.entities.Person;
import np.com.pantbinod.springbootfinaldemo.repository.AddressRepository;
import np.com.pantbinod.springbootfinaldemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/address")
    public List<Address> getAll(){
        return addressRepository.findAll();
    }

    @PostMapping("/address")
    public void getAll(@RequestBody Address address){

        Address address1 = addressRepository.save(address);
        Person person = personRepository.findById(address1.getPerson().getId()).get();
        person.setAddress(address);
        personRepository.save(person);



        }

}
