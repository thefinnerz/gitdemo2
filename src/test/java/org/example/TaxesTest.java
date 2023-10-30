package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxesTest {
    @Test
    void TestCheckBracket() {
        int[] expectedBracket = {9000,0,0,9000};
        int[] actualBracket = Taxes.CheckBracket(9000);
        Assertions.assertEquals(expectedBracket[0], actualBracket[0]);
        Assertions.assertEquals(expectedBracket[1], actualBracket[1]);
        Assertions.assertEquals(expectedBracket[2], actualBracket[2]);
        Assertions.assertEquals(expectedBracket[3], actualBracket[3]);
    }

    @Test
    void TestCheckBracketUpper() {
        int[] expectedBracket = {8000,0,0,8000};
        int[] actualBracket = Taxes.CheckBracket(8000);
        Assertions.assertEquals(expectedBracket[0], actualBracket[0]);
        Assertions.assertEquals(expectedBracket[1], actualBracket[1]);
        Assertions.assertEquals(expectedBracket[2], actualBracket[2]);
        Assertions.assertEquals(expectedBracket[3], actualBracket[3]);
    }

    @Test
    void TestCalcTakeHome() {
        int expectedTakeHome = 7000;
        int[] diffAndBracket = {7000,0,0,7000};
        int actualTakeHome = Taxes.CalcTakeHome(diffAndBracket);
        Assertions.assertEquals(expectedTakeHome,actualTakeHome);
    }
}