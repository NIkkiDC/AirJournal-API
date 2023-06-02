package com.airJournal.api.model;
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
    private String name;
    @Column
    private String description;

    @OneToMany(mappedBy = "activity", orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<City> cityList;

    public Activity(long id, String name, String description){
       this.id = id;
       this.name = name;
       this.description = description;
    }

    public Activity(String name, String description){
        this.name = name;
        this.description = description;
    }
public Activity(){
}


    public Long getId() {return id;}

    public String getName() {return name;}

    public String getDescription() {return description;}

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {this.name = name;}

    public void setDescription(String description) {this.description = description;}

    @Override
    public String toString() {
        return "Activities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", countryList=" + cityList +
                '}';
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }
}
