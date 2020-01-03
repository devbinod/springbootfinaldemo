package np.com.pantbinod.springbootfinaldemo.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import np.com.pantbinod.springbootfinaldemo.model.common.AbstractEntity;

import javax.persistence.*;

@Entity
public class Address extends AbstractEntity {

    private String district;
    private String state;
    private int wardNo;
    private boolean isTemporary;

    @ManyToOne
    @JoinColumn(name = "person_id")
    @JsonIgnore
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public boolean isTemporary() {
        return isTemporary;
    }

    public void setTemporary(boolean temporary) {
        isTemporary = temporary;
    }

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

}
