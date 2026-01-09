package com.bitcrew;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

public class MinistryOfEnvironmentAndEnergyTest {

    @Test
    public void testConstructorInitializesValuesCorrectly() {
        MinistryOfEnvironmentAndEnergy min = new MinistryOfEnvironmentAndEnergy();

        assertEquals("Ministry of Environment and Energy",min.getMinistry());
    }
    @Test
    public void testShowBudgetNoNo() {

        String input = "no\nyes\n";
        Scanner s = new Scanner(input);

        MinistryOfEnvironmentAndEnergy min =
                new MinistryOfEnvironmentAndEnergy();

        min.showBudget(s);

    }
    @Test
    public void testShowBudgetNoYes() {

        String input = "no\nyes\n";
        Scanner s = new Scanner(input);

        MinistryOfEnvironmentAndEnergy min =
                new MinistryOfEnvironmentAndEnergy();

        min.showBudget(s);

    }
    @Test
    public void testShowBudgetYesNo() {

        String input = "yes\nno\n";
        Scanner s = new Scanner(input);

        MinistryOfEnvironmentAndEnergy min =
                new MinistryOfEnvironmentAndEnergy();

        min.showBudget(s);

    }
    @Test
    public void testShowBudgetYesYes() {

        String input = "yes\nyes\n";
        Scanner s = new Scanner(input);

        MinistryOfEnvironmentAndEnergy min =
                new MinistryOfEnvironmentAndEnergy();

        min.showBudget(s);

    }
    @Test
    public void testShowBudgetXYesXNo() {

        String input = "x\nyes\nx\nno\n";
        Scanner s = new Scanner(input);

        MinistryOfEnvironmentAndEnergy min =
                new MinistryOfEnvironmentAndEnergy();

        min.showBudget(s);

    }
}
