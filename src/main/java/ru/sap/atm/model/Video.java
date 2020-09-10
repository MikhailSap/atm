package ru.sap.atm.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String path;
}
