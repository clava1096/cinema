package com.cringe.SocialNW.domain.model;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "purchases")
public class Purchase {

    @Generated
    public Purchase(Integer user_id, Integer ticket_id, Integer session_id, Date purchase_date, Integer price) {
        this.user_id = user_id;
        this.ticket_id = ticket_id;
        this.session_id = session_id;
        this.purchase_date = purchase_date;
        this.price = price;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer user_id;

    @Column
    private Integer ticket_id;

    @Column
    private Integer session_id;

    @Column
    private Date purchase_date;

    @Column
    private Integer price;
}
