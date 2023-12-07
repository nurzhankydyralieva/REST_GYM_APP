package com.epam.xstack.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@Entity
@Table(name = "trainee")
public class Trainee extends User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "trainee_id")
    private UUID id;

    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Column(name = "address")
    private String address;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "trainees")
    private List<Trainer> trainers;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "trainee")
    private List<Training> trainings;
}
