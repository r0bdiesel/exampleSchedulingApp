package com.company.team.exampleSchedulingApp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.mockito.InjectMocks;


@ExtendWith(MockitoExtension.class)
class AppTest {

    @Mock
    private PersonFacade personFacade;

    @InjectMocks
    private App application;

    @Test 
    public void testGetMessage() {
        App app = new App();
        assertEquals("firstNamelastName", app.getBoth());
    }

    @Test 
    public void testGetPerson() {
        when(personFacade.getPerson()).thenReturn("person");
        assertEquals("person", application.getPerson());
    }

    @Disabled("will fail if run")
    @Test
    public void willFail() {
        assertEquals(false, true);
    }
}
