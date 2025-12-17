package com.bitcrew;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinistryOfEducationReligionsAndSportsTest {

    @Test
    public void testConstructorInitializesValuesCorrectly() {
        MinistryOfEducationReligionsAndSports ministry = new MinistryOfEducationReligionsAndSports();

        assertEquals("Ministry of Education, Religions and Sports", ministry.getMinistry());
    }
}
