package com.geniusver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * ApplicationTest
 *
 * @author GeniusV
 */
@SpringBootTest
class ApplicationTest {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    void test() {
        assertNotNull(applicationContext);
    }
}