package com.sapiensCourses.FirstSpring.ioc;

public class Contact {
    int primary_mobile_no;
    int secondary_mobile_no;
    int emergency_no;
    String email_id;
    String Official_email_id;

    public int getPrimary_mobile_no() {
        return primary_mobile_no;
    }

    public void setPrimary_mobile_no(int primary_mobile_no) {
        this.primary_mobile_no = primary_mobile_no;
    }

    public int getSecondary_mobile_no() {
        return secondary_mobile_no;
    }

    public void setSecondary_mobile_no(int secondary_mobile_no) {
        this.secondary_mobile_no = secondary_mobile_no;
    }

    public int getEmergency_no() {
        return emergency_no;
    }

    public void setEmergency_no(int emergency_no) {
        this.emergency_no = emergency_no;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getOfficial_email_id() {
        return Official_email_id;
    }

    public void setOfficial_email_id(String official_email_id) {
        Official_email_id = official_email_id;
    }
}
