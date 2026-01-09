package com.bitcrew;
 import org.junit.jupiter.api.Test; 
 import static org.junit.jupiter.api.Assertions.assertEquals;
 
 import java.util.Scanner; 
 public class MinistryOfInfrastructureAndTransportTest { 
    @Test
    public void testConstructorInitializesValuesCorrectly() { 
        MinistryOfInfrastructureAndTransport min = new MinistryOfInfrastructureAndTransport(); 
        assertEquals("Ministry of Infrastructure and Transport", min.getMinistry()); 
    }
    @Test
    public void testShowBudgetNoNo() {

        String input = "no\nno\n";
        Scanner s = new Scanner(input);

        MinistryOfInfrastructureAndTransport min = new MinistryOfInfrastructureAndTransport();

        min.showBudget(s);

    }
    @Test
    public void testShowBudgetNoYes() {

        String input = "no\nyes\n";
        Scanner s = new Scanner(input);

        MinistryOfInfrastructureAndTransport min = new MinistryOfInfrastructureAndTransport();

        min.showBudget(s);

    }
    @Test
    public void testShowBudgetYesNo() {

        String input = "yes\nno\n";
        Scanner s = new Scanner(input);

        MinistryOfInfrastructureAndTransport min = new MinistryOfInfrastructureAndTransport();

        min.showBudget(s);

    }
    @Test
    public void testShowBudgetYesYes() {

        String input = "yes\nyes\n";
        Scanner s = new Scanner(input);

        MinistryOfInfrastructureAndTransport min = new MinistryOfInfrastructureAndTransport();

        min.showBudget(s);

    }
    @Test
    public void testShowBudgetXYesXNo() {

        String input = "x\nyes\nx\nno\n";
        Scanner s = new Scanner(input);

        MinistryOfInfrastructureAndTransport min = new MinistryOfInfrastructureAndTransport();

        min.showBudget(s);

    }
 }