package test.java.com.kveola13.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {

    @Test
    public void test() {
        boolean condition = true;
        assertEquals(true, condition);
        assertTrue(condition);
        //assertFalse(condition);
        assertNotNull(condition);
        //assertNull(condition);
    }

}
