package com.epam.xstack.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@Entity
@Table(name = "trainee")
public class Trainee extends User {

    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Column(name = "address")
    private String address;
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "trainees")
    private List<Trainer> trainers;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "traineeId")
    private List<Training> trainings;
}
