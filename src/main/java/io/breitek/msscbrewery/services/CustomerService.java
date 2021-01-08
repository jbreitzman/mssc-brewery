package io.breitek.msscbrewery.services;

import io.breitek.msscbrewery.web.model.BeerDto;
import io.breitek.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, BeerDto customerDto);

    void deleteById(UUID customerId);
}
