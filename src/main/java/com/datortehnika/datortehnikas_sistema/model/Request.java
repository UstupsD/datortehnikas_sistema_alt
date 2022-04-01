// This is a model for requests, so that they may be put in a database.
package com.datortehnika.datortehnikas_sistema.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "request")
public class Request implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = true)
    private Long id;
    @Column(name = "employeeId", nullable = false, updatable = true)
    private Long employeeId;
    @OneToOne(mappedBy = "request")// This line makes employee_id a foreign key of id from the Employee table.
    private Employee employee;
    @Column(name = "techId", nullable = false, updatable = true)
    private Long techId;
    @OneToOne(mappedBy = "request")// This line makes tech_id a foreign key of id from the Tech table.
    private Tech tech;
    private String requestReason;
    private int requestStatus;

    public Request() {}
    public Request(Long employeeId, Long techId, String requestReason) {
        this.employeeId = employeeId;
        this.techId = techId;
        this.requestReason = requestReason;
        this.requestStatus = 0;// 0 - BEING REVIEWED | 1 - APPROVED | 2 - DENIED
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getTechId() {
        return techId;
    }

    public void setTechId(Long techId) {
        this.techId = techId;
    }

    public String getRequestReason() {
        return requestReason;
    }

    public void setRequestReason(String requestReason) {
        this.requestReason = requestReason;
    }

    public int getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(int requestStatus){
        this.requestStatus = requestStatus;
    }
    // This is used to view a database entry much easier.
    @Override
    public String toString(){
        return "Request{" +
                "id=" + id + '\n' +
                ", employeeId=" + employeeId + '\n' +
                ", techId=" + techId + '\n' +
                ", requestReason=" + requestReason + '\n' +
                ", requestStatus=" + requestStatus + '\n' +
                '}';
    }
}
