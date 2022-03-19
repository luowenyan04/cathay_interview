package com.example.cathay_interview.Entity.Currency;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "currency")
@Data
public class Currency {
    @Id
    @Column(name = "name")
    String name;

    @Column(name = "name_zh")
    String nameZH;

    @Column(name = "rate")
    String rate;

    @Column(name = "update_time")
    Date updateTime;
}
