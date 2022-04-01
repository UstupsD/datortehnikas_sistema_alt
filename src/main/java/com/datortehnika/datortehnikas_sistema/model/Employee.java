// This is a model for handling employees, so that they may be put in a database.
package com.datortehnika.datortehnikas_sistema.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = true)
    private Long id;
    private String email;
    private String password; //TODO: Encrypt password
    private String firstName;
    private String lastName;
    private String jobTitle;
    private boolean isSysAdmin;
    // The three lines below are responsible for adding a foreign key to the Request table entries.
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Request request;

    public Employee() {}
    // Below is the structure for an entry in the employee database table.
    public Employee(String email, String password, String firstName, String lastName, String jobTitle, boolean isSysAdmin) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.isSysAdmin = isSysAdmin;
    }
    // All of these below are to put the correct values in the database.
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
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
    // This is used to view a database entry much easier.
    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id + '\n' +
                ", email=" + email + '\n' +
                ", password=" + password + '\n' +
                ", firstName=" + firstName + '\n' +
                ", lastName=" + lastName + '\n' +
                ", jobTitle=" + jobTitle + '\n' +
                ", isSysAdmin=" + isSysAdmin + '\n' +
                '}';
    }
}
