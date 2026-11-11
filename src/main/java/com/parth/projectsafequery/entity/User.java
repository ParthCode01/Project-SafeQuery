package com.parth.projectsafequery.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    @ManyToOne
    @JoinColumn(name ="tenant_id")
    private Tenant tenant;

    private String passwordHash;

}
