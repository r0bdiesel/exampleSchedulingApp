package com.company.team.exampleSchedulingApp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;


import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test 
    public void testGetMessage() {
        App app = new App();
        assertEquals("firstNamelastName", app.getBoth());
    }

    @Disabled("will fail if run")
    @Test
    public void willFail() {
        assertEquals(false, true);
    }
}
