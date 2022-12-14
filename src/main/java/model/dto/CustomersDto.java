package model.dto;

import model.PersistentEntity;

import java.util.Objects;

public class CustomersDto extends PersistentEntity {
    private String name;
    private String contactPerson;
    private String phoneNumber;

    public CustomersDto() {
    }

    public CustomersDto(String name, String contactPerson, String phoneNumber) {
        this.name = name;
        this.contactPerson = contactPerson;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CustomersDto that = (CustomersDto) o;
        return Objects.equals(name, that.name) && Objects.equals(contactPerson, that.contactPerson) && Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, contactPerson, phoneNumber);
    }

    @Override
    public String toString() {
        return "Customers {" +
                "name='" + name + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id=" + id +
                '}';
    }
}
