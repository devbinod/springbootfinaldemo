package np.com.pantbinod.springbootfinaldemo.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import np.com.pantbinod.springbootfinaldemo.model.common.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Person extends AbstractEntity {

    private String firstName;
    private String lastName;

    @OneToOne
    @JsonIgnore
    private Address address;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
