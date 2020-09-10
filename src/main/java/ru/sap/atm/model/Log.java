package ru.sap.atm.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "logs")
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String path;
}
