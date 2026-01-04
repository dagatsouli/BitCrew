package com.bitcrew;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinistryOfHealthTest {

    @Test
    public void testConstructorInitializesValuesCorrectly() {
        MinistryOfHealth min = new MinistryOfHealth();

        assertEquals("Ministry of Health", min.getMinistry());
    }
}

