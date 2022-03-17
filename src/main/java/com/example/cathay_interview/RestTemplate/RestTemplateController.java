package com.example.cathay_interview.RestTemplate;

import com.example.cathay_interview.Entity.CoinDesk.CoinDesk;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {

    @GetMapping("/getCoinDesk")
    public CoinDesk getCoinDesk() {

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new JavaScriptMessageConverter());

        CoinDesk coinDesk = restTemplate.getForObject(
                "https://api.coindesk.com/v1/bpi/currentprice.json",
                CoinDesk.class);

        System.out.println(coinDesk);

        return coinDesk;
    }

}
