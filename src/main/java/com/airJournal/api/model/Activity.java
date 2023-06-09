package com.airJournal.api.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="activities")
public class Activity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name; // activity repo
    @Column
    private String description;


    @ManyToOne
    @JoinColumn(name = "city_id")
    @JsonIgnore
    private City city;


    public Activity(Long id, String name, String description){
       this.id = id;
       this.name = name;
       this.description = description;
    }


public Activity(){
}

    /**
     * creating the getters and setters as well as constructor
     * @return
     */

    public Long getId() {return id;}

    public String getName() {return name;}

    public String getDescription() {return description;}

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {this.name = name;}

    public void setDescription(String description) {this.description = description;}

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Activities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';

    }
}
