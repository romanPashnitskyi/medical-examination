package com.medical.service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Date;
import java.util.Set;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Examination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private Date dateOfSurvey;

    private String fosfenOs;

    private String botOd;

    private String botOs;

    private Blob vizusOd;

    private Blob vizusOs;

    private Blob humphreyOd;

    private Blob humphreyOs;

    private Blob hicknessOfCorneaOd1;

    private Blob hicknessOfCorneaOd2;

    private Blob hicknessOfCorneaOd3;

    private Blob hicknessOfCorneaOd4;

    private Blob hicknessOfCorneaOs1;

    private Blob hicknessOfCorneaOs2;

    private Blob hicknessOfCorneaOs3;

    private Blob hicknessOfCorneaOs4;

    private Blob atlasOd;

    private Blob atlasOs;

    private Blob cameraOd;

    private Blob cameraOs;

    private Blob cameraOd3D;

    private Blob cameraOs3D;

    private Blob corneenOd;

    private Blob corneenOs;

    private Blob gdxOd;

    private Blob gdxOs;

    private Blob hrtOd;

    private Blob hrtOs;

    private Blob maculaOd1;

    private Blob maculaOd2;

    private Blob maculaOd3;

    private Blob maculaOd4;

    private Blob maculaOs1;

    private Blob maculaOs2;

    private Blob maculaOs3;

    private Blob maculaOs4;

    private Blob maculaOd3D1;

    private Blob maculaOd3D2;

    private Blob maculaOd3D3;

    private Blob maculaOd3D4;

    private Blob maculaOs3D1;

    private Blob maculaOs3D2;

    private Blob maculaOs3D3;

    private Blob maculaOs3D4;

    private Blob sightOd;

    private Blob sightOs;

    private Blob atlasOu;

    private Blob maculaOu;

    private Blob hrtOu;

    private Blob fieldViewOu;

    private String formatFileVizusOd;

    private String formatFileVizusOs;

    private String formatFileHumphreyOd;

    private String formatFileHumphreyOs;

    private String formatFileHicknessOfCorneaOd1;

    private String formatFileHicknessOfCorneaOd2;

    private String formatFileHicknessOfCorneaOd3;

    private String formatFileHicknessOfCorneaOd4;

    private String formatFileHicknessOfCorneaOs1;

    private String formatFileHicknessOfCorneaOs2;

    private String formatFileHicknessOfCorneaOs3;

    private String formatFileHicknessOfCorneaOs4;

    private String formatFileAtlasOd;

    private String formatFileAtlasOs;

    private String formatFileCameraOd;

    private String formatFileCameraOs;

    private String formatFileCameraOd3D;

    private String formatFileCameraOs3D;

    private String formatFileCorneenOd;

    private String formatFileCorneenOs;

    private String formatFileGdxOd;

    private String formatFileGdxOs;

    private String formatFileHrtOd;

    private String formatFileHrtOs;

    private String formatFileMaculaOd1;

    private String formatFileMaculaOd2;

    private String formatFileMaculaOd3;

    private String formatFileMaculaOd4;

    private String formatFileMaculaOs1;

    private String formatFileMaculaOs2;

    private String formatFileMaculaOs3;

    private String formatFileMaculaOs4;

    private String formatFileMaculaOd3D1;

    private String formatFileMaculaOd3D2;

    private String formatFileMaculaOd3D3;

    private String formatFileMaculaOd3D4;

    private String formatFileMaculaOs3D1;

    private String formatFileMaculaOs3D2;

    private String formatFileMaculaOs3D3;

    private String formatFileMaculaOs3D4;

    private String formatFileSightOd;

    private String formatFileSightOs;

    private String formatFileAtlasOu;

    private String formatFileMaculaOu;

    private String formatFileHrtOu;

    private String formatFileFieldViewOu;

    @NonNull
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @NonNull
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "worker_id")
    private Worker worker;

    @JsonBackReference
    @OneToMany(mappedBy = "examination", cascade = CascadeType.ALL)
    private Set<Treatment> treatments;
}
