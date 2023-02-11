package com.company.team.exampleSchedulingApp;

import com.company.team.exampleschedulingmodel.Customer;

import javax.inject.Named;
import javax.inject.Inject;


public class App {

    @Inject
    @Named("personFacade")
    private PersonFacade personFacade;

    public String getPerson() {
        return personFacade.getPerson();
    }


    public String getBoth() {
        Customer c = new Customer(1L,"firstName","lastName");
        return c.getFirstName() + c.getLastName();
    }
}
