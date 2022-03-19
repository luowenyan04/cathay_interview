package com.example.cathay_interview.Dao;

import com.example.cathay_interview.Entity.Currency.Currency;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyDao extends CrudRepository<Currency, String> {
}
