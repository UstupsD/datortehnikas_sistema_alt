// This is a model for handling tech, so that they may be put in a database.
package com.datortehnika.datortehnikas_sistema.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tech")
public class Tech implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = true)
    private Long id;
    private String techName;
    private String description;
    private boolean availability;
    private String imageUrl;
    // The three lines below are responsible for adding a foreign key to the Request table entries.
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tech_id", referencedColumnName = "id")
    private Request request;

    public Tech() {}
    // Below is the structure for an entry in the tech database table.
    public Tech(String techName, String description, boolean availability, String imageUrl) {
        this.techName = techName;
        this.description = description;
        this.availability = availability;
        this.imageUrl = imageUrl;
    }
    // All of these below are to put the correct values in the database.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability){
        this.availability = availability;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    // This is used to view a database entry much easier.
    @Override
    public String toString() {
        return "Tech{" +
                "id=" + id + '\n' +
                ", techName=" + techName + '\n' +
                ", description=" + description + '\n' +
                ", availability=" + availability + '\n' +
                ", imageUrl=" + imageUrl + '\n' +
                '}';
    }
}
