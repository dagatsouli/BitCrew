package com.bitcrew;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinistryOfNationalDefenseTest {

    @Test
    public void testConstructorInitializesValuesCorrectly() {
        MinistryOfNationalDefense min = new MinistryOfNationalDefense();

        assertEquals("Ministry of National Defense", min.getMinistry());
    }
}
