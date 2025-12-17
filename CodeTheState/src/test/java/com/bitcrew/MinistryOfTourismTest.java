package com.bitcrew;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinistryOfTourismTest {

    @Test
    public void testConstructorInitializesValuesCorrectly() {
        MinistryOfTourism min = new MinistryOfTourism();

        String name = min.getMinistry();
        assertEquals("Ministry of Tourism", name);

        assertEquals(39_293_000L, min.getRegularBudget());
        assertEquals(150_000_000L, min.getInvestmentBudget());
    }
}
