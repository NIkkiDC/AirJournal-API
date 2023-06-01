package com.airJournal.api.model;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Activities {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String description;

    @OneToMany(mappedBy = "activities", orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<City> cityList;

    public City(long id, String name, String description){
       this.id = id;
       this.name = name;
       this.description = description;
    }

    public Activities(String name, String description){
        this.name = name;
        this.description = description;
    }
public Activities(){

}
}
