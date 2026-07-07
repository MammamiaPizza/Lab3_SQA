package SQA.Lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for TestShiftCipher.
 */
public class TestShiftCipher {
	
	ShiftCipher Cipher = new ShiftCipher();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Tc01_TestAllHigh() {
        assertEquals("VRIWZDUH", Cipher.shift("SOFTWARE", 3));
    }
    
    @Test
    public void TC02_TestAllLow() {
    	assertEquals("VRIWZDUH", Cipher.shift("software", 3));
    }
    
    @Test
    public void TC03_TestNumberBetweenText() {
    	assertEquals("V0IWZ4UH", Cipher.shift("S0FTW4RE", 3));
    }
    
    @Test
    public void TC04_TestOtherKey() {
    	assertEquals("SOFTWARE", Cipher.shift("VRIWZDUH", 2));
    }
    
    @Test
    public void TC05_TestNonAlphabet() {
    	assertEquals("invalid", Cipher.shift("SOFTWARE?!", 3));
    }
    
}
