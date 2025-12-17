package com.bitcrew;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinistryOfEnvironmentAndEnergyTest {

    @Test
    public void testConstructorInitializesValuesCorrectly() {
        MinistryOfEnvironmentAndEnergy min =
                new MinistryOfEnvironmentAndEnergy();

        assertEquals(
            "Ministry of Environment and Energy",
            min.getMinistry()
        );

        assertEquals(319_227_000L, min.getRegularBudget());
        assertEquals(2_022_000_000L, min.getInvestmentBudget());
    }
}
