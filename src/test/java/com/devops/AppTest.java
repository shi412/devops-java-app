package com.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testGreet() {
        assertEquals(
            "Hello from Java Maven CI/CD!",
            App.greet()
        );
    }
}

