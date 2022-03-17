package com.example.cathay_interview.Entity.CoinDesk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Bpi {
    @JsonProperty("USD")
    Currency USD;

    @JsonProperty("GBP")
    Currency GBP;

    @JsonProperty("EUR")
    Currency EUR;
}
