package com.example.cathay_interview.RestController;

import com.example.cathay_interview.Entity.CoinDesk.CoinDesk;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class CoinDeskController {

    /**
     * 呼叫coindesk API
     *
     * @return
     */
    @GetMapping("/getCoinDesk")
    public CoinDesk getCoinDesk() {

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new JavaScriptMessageConverter());

        CoinDesk coinDesk = restTemplate.getForObject(
                "https://api.coindesk.com/v1/bpi/currentprice.json",
                CoinDesk.class);

        return coinDesk;
    }


}
