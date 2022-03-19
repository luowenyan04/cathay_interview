package com.example.cathay_interview.Entity.CoinDesk;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Time {
    String updated;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    Date updatedISO;

    String updateduk;
}
