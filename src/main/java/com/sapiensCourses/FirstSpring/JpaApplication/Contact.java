package com.sapiensCourses.FirstSpring.JpaApplication;

import javax.persistence.*;

@Entity
public class Contact {
    @Id
    private int contact_id;
    private String firstName;
    private String lastName;
    private String dob;
    private String design;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id")
    private Address address;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id")
    private InsuranceDetails insuranceDetails;

    public int getContact_id() {
        return contact_id;
    }

    public void setContact_id(int contact_id) {
        this.contact_id = contact_id;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public InsuranceDetails getInsuranceDetails() {
        return insuranceDetails;
    }

    public void setInsuranceDetails(InsuranceDetails insuranceDetails) {
        this.insuranceDetails = insuranceDetails;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contact_id=" + contact_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", design='" + design + '\'' +
                ", address=" + address +
                ", insuranceDetails=" + insuranceDetails +
                '}';
    }

    public static Contact create(String firstName, String lastName, String dob, String design, Address addr , InsuranceDetails insurance){
        Contact contact = new Contact();
        Address address = new Address();
        InsuranceDetails insuranceDetails = new InsuranceDetails();

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setDob(dob);
        contact.setDesign(design);


        address.setAddress(addr.getAddress());
        address.setContactNo(addr.getContactNo());
        address.setEmail_id(addr.getEmail_id());
        address.setCountry(addr.getCountry());

        insuranceDetails.setInsurance_type(insurance.getInsurance_type());
        insuranceDetails.setValid_till(insurance.getValid_till());
        insuranceDetails.setPremium_amount(insurance.getPremium_amount());

        contact.setAddress(address);
        contact.setInsuranceDetails(insuranceDetails);

        return contact;

    }
}
