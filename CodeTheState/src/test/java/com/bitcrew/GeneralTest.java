package com.bitcrew;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralTest {

    @Test
    public void testGetBudgetBalance() {
        long expectedBalance = General.TOTAL_REVENUES - General.TOTAL_EXPENSES;
        assertEquals(expectedBalance, General.getBudgetBalance());
    }
}
