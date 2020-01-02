package np.com.pantbinod.springbootfinaldemo.model.entities;

import np.com.pantbinod.springbootfinaldemo.model.common.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Address extends AbstractEntity {

    private String district;
    private String state;
    private int wardNo;


    @OneToOne(optional = false)
    private Person person;

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getWardNo() {
        return wardNo;
    }

    public void setWardNo(int wardNo) {
        this.wardNo = wardNo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
