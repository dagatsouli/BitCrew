package com.bitcrew;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

public class MinistryOfEducationReligionsAndSportsTest {

    @Test
    public void testConstructorInitializesValuesCorrectly() {
        MinistryOfEducationReligionsAndSports ministry = new MinistryOfEducationReligionsAndSports();

        assertEquals("Ministry of Education, Religions and Sports", ministry.getMinistry());
    }
    @Test
    public void testShowBudgetNoNo() {

        String input = "no\nno\n";
        Scanner s = new Scanner(input);

        MinistryOfEducationReligionsAndSports ministry =
                new MinistryOfEducationReligionsAndSports();

        ministry.showBudget(s);

    }
    @Test
    public void testShowBudgetNoYes() {

        String input = "no\nyes\n";
        Scanner s = new Scanner(input);

        MinistryOfEducationReligionsAndSports ministry =
                new MinistryOfEducationReligionsAndSports();

        ministry.showBudget(s);

    }
    @Test
    public void testShowBudgetYesNo() {

        String input = "yes\nno\n";
        Scanner s = new Scanner(input);

        MinistryOfEducationReligionsAndSports ministry =
                new MinistryOfEducationReligionsAndSports();

        ministry.showBudget(s);

    }
    @Test
    public void testShowBudgetYesYes() {

        String input = "yes\nyes\n";
        Scanner s = new Scanner(input);

        MinistryOfEducationReligionsAndSports ministry =
                new MinistryOfEducationReligionsAndSports();

        ministry.showBudget(s);

    }
    @Test
    public void testShowBudgetXYesXNo() {

        String input = "x\nyes\nx\nno\n";
        Scanner s = new Scanner(input);

        MinistryOfEducationReligionsAndSports ministry =
                new MinistryOfEducationReligionsAndSports();

        ministry.showBudget(s);

    }
}
