package edu.ifrs.vvs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /**
     * Rigorous Test.
     */
    @Test
    @DisplayName("Teste básico")
    void testApp() {
        assertEquals(1, 1);
    }

    /**
     * Test of bubblesort class.
     */
    @Test
    @SuppressWarnings("checkstyle:magicnumber, linelength")
    @DisplayName("Deve retornar na ordem certa")
    void testaOrdem() {
        HeapSort ob = new HeapSort();
        int[] firstValue = {10, 3, 1};
        int[] firstExpected = {1, 3, 10};
        int[] thirdExpected = {8, 20, 22, 33, 66, 77, 112, 8712, 333333};
        int[] secondValue = {5, 30, 999, 1, 222, 9, 10};
        int[] secondExpected = {1, 5, 9, 10, 30, 222, 999};
        int[] thirdValue = {8, 20, 33, 66, 77, 22, 333333, 112, 8712};
        ob.sort(firstValue);
        ob.sort(secondValue);
        ob.sort(thirdValue);
        assertAll(() -> assertArrayEquals(firstExpected, firstValue),
                () -> assertArrayEquals(secondExpected, secondValue),
                () -> assertArrayEquals(thirdExpected, thirdValue));
    }

}
