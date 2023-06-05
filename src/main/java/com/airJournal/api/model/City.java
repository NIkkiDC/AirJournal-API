package com.airJournal.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="cities")
public class City {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String description;

    @JsonIgnore
    @ManyToOne // many cities to one activity
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public City() {}

    public City(Long id, String name, String description) {
        this.id = id; // id number
        this.name = name; // name of city
        this.description = description; // description of city //weather, or something
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", activities=" + activity +
                '}';
    }
}
