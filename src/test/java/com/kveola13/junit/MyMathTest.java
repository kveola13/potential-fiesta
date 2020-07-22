package test.java.com.kveola13.junit;

import main.java.com.kveola13.junit.MyMath;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {
    MyMath myMath = new MyMath();

    @BeforeEach
    public void before() {
        System.out.println("Before");
    }

    @AfterEach
    public void after() {
        System.out.println("After");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all");
    }

    @Test
    public void sum_with_numbers() {
        assertEquals(6, myMath.sum(new int[]{1, 2, 3}));
    }

    @Test
    public void sum_with_number() {
        assertEquals(3, myMath.sum(new int[]{3}));
    }
}