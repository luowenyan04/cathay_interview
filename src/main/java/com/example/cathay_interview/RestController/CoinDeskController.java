package com.example.cathay_interview.RestController;

import com.example.cathay_interview.Entity.CoinDesk.CoinDesk;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cathay", produces = MediaType.APPLICATION_JSON_VALUE)
public class CoinDeskController {

    @GetMapping("/CoinDesk")
    public CoinDesk getConDesk() {
        return new CoinDesk();
    }

    @PostMapping("/CoinDesk")
    public CoinDesk insCoinDesk(@RequestBody CoinDesk request) {
        return request;
    }

}
