package com.example.cathay_interview.Entity.CoinDesk;

import lombok.Data;

@Data
public class Currency {
    String code;
    String symbol;
    String rate;
    String description;
    float rate_float;
}
