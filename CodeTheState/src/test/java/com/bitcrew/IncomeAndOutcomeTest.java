package com.bitcrew;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

public class IncomeAndOutcomeTest {

    @Test
    public void testGetBudgetBalance() {
        long expectedBalance = IncomeAndOutcome.TOTAL_REVENUES - IncomeAndOutcome.TOTAL_EXPENSES;
        assertEquals(expectedBalance, IncomeAndOutcome.getBudgetBalance());
    }
       @Test
    public void testShowReportNoNo() {
        String input = "no\nno\n";
        Scanner s = new Scanner(input);

        IncomeAndOutcome.showReport(s);
    }

    @Test
    public void testShowReportNoYes() {
        String input = "no\nyes\n";
        Scanner s = new Scanner(input);

        IncomeAndOutcome.showReport(s);
    }

    @Test
    public void testShowReportYesNo() {
        String input = "yes\nno\n";
        Scanner s = new Scanner(input);

        IncomeAndOutcome.showReport(s);
    }

    @Test
    public void testShowReportYesYes() {
        String input = "yes\nyes\n";
        Scanner s = new Scanner(input);

        IncomeAndOutcome.showReport(s);
    }

    @Test
    public void testShowReportXYesXNo() {
        String input = "x\nyes\nx\nno\n";
        Scanner s = new Scanner(input);

        IncomeAndOutcome.showReport(s);
    }
}

