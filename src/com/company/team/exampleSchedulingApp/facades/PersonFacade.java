package com.company.team.exampleSchedulingApp;

import javax.inject.Named;
import javax.inject.Inject;

@Named("personFacade")
public class PersonFacade {

	@Inject
    @Named("personClient")
	private PersonClient personClient;

    public String getPerson() {
        return personClient.getPerson();
    }
}

