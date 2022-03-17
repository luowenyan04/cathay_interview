package com.example.cathay_interview.Entity.CoinDesk;

import lombok.Data;

@Data
public class CoinDesk {
    Time time;
    String disclaimer;
    String chartName;
    Bpi bpi;
}
