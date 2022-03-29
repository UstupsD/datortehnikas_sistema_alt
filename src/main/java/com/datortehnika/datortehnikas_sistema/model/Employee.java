package com.datortehnika.datortehnikas_sistema.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = true)
    private Long id;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private boolean isSysAdmin;

    public Employee() {}

    public Employee(String firstName, String lastName, String jobTitle, boolean isSysAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.isSysAdmin = isSysAdmin;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public boolean getIsSysAdmin() {
        return isSysAdmin;
    }
    public void setIsSysAdmin(boolean isSysAdmin) {
        this.isSysAdmin = isSysAdmin;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id + '\n' +
                ", firstName=" + firstName + '\n' +
                ", lastName=" + lastName + '\n' +
                ", jobTitle=" + jobTitle + '\n' +
                ", isSysAdmin=" + isSysAdmin + '\n' +
                '}';
    }
}
