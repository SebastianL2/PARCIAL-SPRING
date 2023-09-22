package com.dev2prod.manytomany.employee.entity;

import com.dev2prod.manytomany.project.entity.Project;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "participante")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String empName;

    @ManyToMany
    @JoinTable(name = "eventos_participantes",
            joinColumns = @JoinColumn(name = "envento_id"),
            inverseJoinColumns = @JoinColumn(name = "participante_id")
    )
    private Set<Project> assignedProjects = new HashSet<>();
}
