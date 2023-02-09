package com.company.team.exampleSchedulingApp;

import com.company.team.exampleschedulingmodel.Customer;


public class App {

    public String getBoth() {
        Customer c = new Customer(1L,"firstName","lastName");
        return c.getFirstName() + c.getLastName();
    }
}
