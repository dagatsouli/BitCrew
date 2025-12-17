package com.bitcrew;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinistryHealthTest {

    @Test
    public void testConstructorInitializesValuesCorrectly() {
        MinistryHealth min = new MinistryHealth();

        assertEquals("Ministry of Health", min.getMinistry());
    }
}
