package com.medical.service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Patient")
public class Patient{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date dateOfBirth;

    private String additionalInformation;

    private int sex;

    private String telephone;

    private String email;

    private String country;

    private String oblast;

    private String region;

    private String settlement;

    private String street;

    private String house;

    private String apartment;

    @NonNull
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="worker_id")
    private Worker worker;

    @JsonBackReference
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private Set<Examination> examinations;
}