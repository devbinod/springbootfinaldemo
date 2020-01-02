package np.com.pantbinod.springbootfinaldemo.model.entities;

import np.com.pantbinod.springbootfinaldemo.model.common.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Student extends AbstractEntity {


    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNumber;
    private int rollNo;
    private String address;

    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", rollNo=" + rollNo +
                ", address='" + address + '\'' +
                '}';
    }

    @PreUpdate
    public void preUpdate() {
        this.fullName = getFullNames();

    }


    @PrePersist
    public void prePersisten() {
        this.fullName = getFullNames();

    }

    private String getFullNames() {
        if (this.middleName != null)
            return this.firstName + " " + this.middleName + " " + this.lastName;
        else
            return this.firstName + " " + this.lastName;


    }
}
