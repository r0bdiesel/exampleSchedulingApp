package com.company.team.exampleSchedulingApp;

import javax.inject.Named;

@Named("personClient")
public class PersonClient {

	public String getPerson() {
        return "person";
    }

}