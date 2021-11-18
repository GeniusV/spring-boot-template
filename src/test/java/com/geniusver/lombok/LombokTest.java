package com.geniusver.lombok;

import org.junit.jupiter.api.Test;

/**
 * LombokTest
 *
 * @author GeniusV
 */
public class LombokTest {
    @Test
    void testLombok() {
        TestPojo testPojo = new TestPojo();
        testPojo.setString("123");
    }
}
