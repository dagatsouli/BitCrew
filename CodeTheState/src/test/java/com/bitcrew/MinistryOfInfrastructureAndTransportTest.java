package com.bitcrew;
 import org.junit.jupiter.api.Test; 
 import static org.junit.jupiter.api.Assertions.assertEquals; 
 public class MinistryOfInfrastructureAndTransportTest { 
    @Test
    public void testConstructorInitializesValuesCorrectly() { 
        MinistryOfInfrastructureAndTransport min = new MinistryOfInfrastructureAndTransport(); 
        String name = min.getMinistry();
        assertEquals("Ministry of Infrastructure and Transport", name); 
    }
 }