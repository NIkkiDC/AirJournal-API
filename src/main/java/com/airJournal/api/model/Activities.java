package com.airJournal.api.model;


import javax.persistence.*;

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

}
