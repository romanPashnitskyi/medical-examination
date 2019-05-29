package com.medical.service.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Worker {

    @Builder
    public Worker(String name, String email, String accessDatabaseType, String accountStatus, String login, String password) {
        this.name = name;
        this.email = email;
        this.accessDatabaseType = accessDatabaseType;
        this.accountStatus = accountStatus;
        this.login = login;
        this.password = password;
    }

    @Id
    @Setter @Getter
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    private Date dateOfBirth;

    private String institution;

    private String position;

    private String telephone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String accessDatabaseType;

    @Column(nullable = false)
    private String accountStatus;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @JsonBackReference
    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    private Set<Examination> examinations;

    @JsonBackReference
    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    private Set<Patient> patients;
}
