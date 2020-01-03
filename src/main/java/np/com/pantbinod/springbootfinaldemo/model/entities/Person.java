package np.com.pantbinod.springbootfinaldemo.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import np.com.pantbinod.springbootfinaldemo.model.common.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Person extends AbstractEntity {

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "person")
    private List<Address> address;

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
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
