package com.example.cathay_interview.Service;

import com.example.cathay_interview.Dao.CurrencyDao;
import com.example.cathay_interview.Entity.Currency.Currency;
import com.example.cathay_interview.Exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CurrencyService {

    @Autowired
    private CurrencyDao currencyDao;

    public Currency getCurrency(String name) {
        return currencyDao.findById(name)
                .orElseThrow(() -> new NotFoundException("查無此資料"));
    }

    public Currency createCurrency(Currency request) {
        return currencyDao.save(request);
    }
}
