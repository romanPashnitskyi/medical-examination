package com.medical.service.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private Date dateOfTreatment;

    private Integer myotics;

    private Integer betaBlockers;

    private Integer prostaglandins;

    private Integer pbInjection;

    private Integer bbInjection;

    private Integer bmInjection;

    private Integer oralInjections;

    private Integer physiotherapy;

    private Integer rearSclerectomy;

    private Integer sinusothrabuculotomy;

    private Integer sinusotrabuculotomyWithBasaliridectomy;

    private Integer applicationOfLaserTreatment;

    private Integer iridectomy;

    private Integer trabeculotomy;

    private Integer cyclodegradation;

    private String myoticsText;

    private String betaBlockersText;

    private String prostaglandinsText;

    private String pbInjectionText;

    private String bbInjectionText;

    private String bmInjectionText;

    private String oralInjectionsText;

    private String physiotherapyText;

    private String rearSclerectomyText;

    private String sinusothrabuculotomyText;

    private String sinusotrabuculotomyWithBasaliridectomyText;

    private String applicationOfLaserTreatmentText;

    private String iridectomyText;

    private String trabeculotomyText;

    private String cyclodegradationText;

    private String infoTextArea;

    @NonNull
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "examination_id")
    private Examination examination;
}
