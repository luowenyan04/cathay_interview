package com.example.cathay_interview.RestController;

import com.example.cathay_interview.Entity.Currency.Currency;
import com.example.cathay_interview.Service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cathay", produces = MediaType.APPLICATION_JSON_VALUE)
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/currency/{name}")
    public ResponseEntity<Currency> getCurrency(@PathVariable String name) {
        Currency currency = currencyService.getCurrency(name);
        return ResponseEntity.ok(currency);
    }

    @PostMapping("/currency")
    public Currency insCurrency(@RequestBody Currency request) {
        currencyService.createCurrency(request);
        return currencyService.createCurrency(request);
    }

    @PutMapping("/currency/{name}")
    public Currency updCurrency(@PathVariable String name,
                                @RequestBody Currency currency) {
        return null;
    }

    @DeleteMapping("/currency/{name}")
    public Boolean delCurrency(@PathVariable String name) {
        return null;
    }

}
