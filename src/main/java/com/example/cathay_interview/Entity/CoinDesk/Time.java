package com.example.cathay_interview.Entity.CoinDesk;

import lombok.Data;

@Data
public class Time {
    String updated;
    //  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    String updatedISO;

    String updateduk;
}
