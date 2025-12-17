package com.bitcrew;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinistryHealthTest {

    @Test
    public void testConstructorInitializesValuesCorrectly() {
        MinistryHealth min = new MinistryHealth();

        assertEquals("Ministry of Health", min.getMinistry());
        assertEquals(6_607_824_000L, min.getRegularBudget());
        assertEquals(7_745_824_000L, min.getInvestmentBudget());
    }
}
