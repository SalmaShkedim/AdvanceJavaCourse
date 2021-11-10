package com.sapiensCourses.FirstSpring.JpaApplication;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InsuranceDetails {
    @Id
    private int id;
    private String insurance_type;
    private String valid_till;
    private double premium_amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInsurance_type() {
        return insurance_type;
    }

    public void setInsurance_type(String insurance_type) {
        this.insurance_type = insurance_type;
    }

    public String getValid_till() {
        return valid_till;
    }

    public void setValid_till(String valid_till) {
        this.valid_till = valid_till;
    }

    public double getPremium_amount() {
        return premium_amount;
    }

    public void setPremium_amount(double premium_amount) {
        this.premium_amount = premium_amount;
    }


    @Override
    public String toString() {
        return "InsuranceDetails{" +
                "id=" + id +
                ", insurance_type='" + insurance_type + '\'' +
                ", valid_till='" + valid_till + '\'' +
                ", premium_amount=" + premium_amount +
                '}';
    }
}
