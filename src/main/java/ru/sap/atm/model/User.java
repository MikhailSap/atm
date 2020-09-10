package ru.sap.atm.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "usrs")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String pincode;
    private Long score;
    @ManyToOne
    private Role role;
}
