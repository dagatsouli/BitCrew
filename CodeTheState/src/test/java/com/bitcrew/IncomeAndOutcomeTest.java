package com.bitcrew;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeAndOutcomeTest {

    @Test
    public void testGetBudgetBalance() {
        long expectedBalance = IncomeAndOutcome.TOTAL_REVENUES - IncomeAndOutcome.TOTAL_EXPENSES;
        assertEquals(expectedBalance, IncomeAndOutcome.getBudgetBalance());
    }
}

