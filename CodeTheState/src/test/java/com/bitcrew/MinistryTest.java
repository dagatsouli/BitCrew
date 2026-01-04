package com.bitcrew;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

public class MinistryTest {

    // Dummy concrete subclass για να τεστάρουμε την abstract class
    private static class DummyMinistry extends Ministry {
        public DummyMinistry(String name, long regular, long investment) {
            super(name, regular, investment);
        }

        @Override
        public void showBudget(Scanner input) {
            // Άδεια υλοποίηση για test
        }
    }

    @Test
    public void testConstructorInitializesValuesCorrectly() {
        DummyMinistry min = new DummyMinistry("Dummy Ministry", 1_000_000L, 2_000_000L);

        assertEquals("Dummy Ministry", min.getMinistry());
        assertEquals(1_000_000L, min.getRegularBudget());
        assertEquals(2_000_000L, min.getInvestmentBudget());
        assertEquals(3_000_000L, min.getTotalBudget());
    }

    @Test
    public void testIncreaseRegularBudget() {
        DummyMinistry min = new DummyMinistry("Dummy Ministry", 1_000_000L, 2_000_000L);

        long initialRegular = min.getRegularBudget();
        long initialTotal = min.getTotalBudget();

        min.increaseRegularBudget(500_000L);

        assertEquals(initialRegular + 500_000L, min.getRegularBudget());
        assertEquals(initialTotal + 500_000L, min.getTotalBudget());
    }

    @Test
    public void testIncreaseInvestmentBudget() {
        DummyMinistry min = new DummyMinistry("Dummy Ministry", 1_000_000L, 2_000_000L);

        long initialInvestment = min.getInvestmentBudget();
        long initialTotal = min.getTotalBudget();

        min.increaseInvestmentBudget(300_000L);

        assertEquals(initialInvestment + 300_000L, min.getInvestmentBudget());
        assertEquals(initialTotal + 300_000L, min.getTotalBudget());
    }

    @Test
    public void testIncreaseBudgetWithNegativeOrZeroAmountDoesNothing() {
        DummyMinistry min = new DummyMinistry("Dummy Ministry", 1_000_000L, 2_000_000L);

        long initialRegular = min.getRegularBudget();
        long initialInvestment = min.getInvestmentBudget();
        long initialTotal = min.getTotalBudget();

        min.increaseRegularBudget(-1000);
        min.increaseInvestmentBudget(0);

        assertEquals(initialRegular, min.getRegularBudget());
        assertEquals(initialInvestment, min.getInvestmentBudget());
        assertEquals(initialTotal, min.getTotalBudget());
    }
}

