package np.com.pantbinod.springbootfinaldemo.controller;

import np.com.pantbinod.springbootfinaldemo.model.entities.Address;
import np.com.pantbinod.springbootfinaldemo.model.entities.Person;
import np.com.pantbinod.springbootfinaldemo.repository.AddressRepository;
import np.com.pantbinod.springbootfinaldemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons/{id}/addresses")
    public List<Address> getAll(@PathVariable Long id,@RequestParam(required = false, name = "temp") boolean isTemp){

        return addressRepository.findByPersonId(id);
    }

    @PostMapping("/persons/{id}/addresses")
    public void getAll(@PathVariable Long id, @RequestBody Address address){

        personRepository.findById(id).map(person -> {
           address.setPerson(person);
           return addressRepository.saveAndFlush(address);


        });



        }

}
