package com.cringe.SocialNW.domain.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tickets")

public class Ticket {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue - generated new ID;
    private Integer id;

    @Column
    private Date date;

    @Column
    private Integer session_id;

    @Column
    private Integer row_and_place_id;

    @Column
    private Boolean issold;

    @Column
    private Integer price;
}
