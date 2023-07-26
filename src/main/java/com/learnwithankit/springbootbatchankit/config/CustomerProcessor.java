package com.learnwithankit.springbootbatchankit.config;

import com.learnwithankit.springbootbatchankit.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

//itemProcessor
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        //in case you want to put filter condition and import selected records
//        if(customer.getCountry().equals("United States")) {
//            return customer;
//        } else {
//            return null;
//        }

        //if you don't want to put any filter
        return customer;
    }
}
