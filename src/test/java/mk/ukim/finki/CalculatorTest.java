package mk.ukim.finki;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @BeforeAll
    static void init(){
        System.out.println("@BeforeAll - This method will be invoked BEFORE all other methods");
    }

    @AfterAll
    static void destroy(){
        System.out.println("@AfterAll - This method will be invoked AFTER all other methods");
    }

    @BeforeEach
    void beforeEachTest(){
        System.out.println("@BeforeEach - This method will be invoked BEFORE each test");
    }

    @AfterEach
    void afterEachTest(){
        System.out.println("@AfterEach - This method will be invoked AFTER each test");
    }

    @Test
    void divideNormalNumbers(){
        System.out.println("Test divideNormalNumbers");
        assertEquals(3, calculator.divide(9,3));
        assertEquals(1, calculator.divide(5,5));
        assertEquals(1, calculator.divide(1,1));
        assertEquals(0, calculator.divide(0,10));
    }

    @Test
    void divideDecimalNumbers(){
        System.out.println("Test divideDecimalNumbers");
        assertEquals(2.5, calculator.divide(8.75, 3.5));
        assertEquals(0.6, calculator.divide(2.1, 3.5));
        assertEquals(0.5, calculator.divide(1.2, 2.4));
        assertEquals(0, calculator.divide(0, 2.4));
    }


//    void standardAssertions(){
//        assertEquals(3, calculator.divide(9,3));
//        assertEquals(2, calculator.divide(4,2), "The optional failure message is now the last parameter");
//        assertTrue(2 > calculator.divide(2,2), "Optional failure message");
//        assertNotEquals(2, calculator.divide(5,2));
//    }
//
//    @Test
//    void groupedAssertions(){
//        assertAll("heading",
//                () -> assertEquals(3, calculator.divide(9,3)),
//                () -> assertEquals(2, calculator.divide(4,2)),
//                () -> assertEquals(1, calculator.divide(5,5)),
//                () -> assertEquals(0, calculator.divide(0,2))
//                );
//    }
//
//    @Test
//    void timeoutNotExceeded(){
//        assertTimeout(Duration.ofMillis(2), () -> {
//            calculator.calculateIntInterval(0, 5);
//        });
//    }
//
//    @Test
//    void exceptionTestingFirstWay(){
//        assertThrows(RuntimeException.class, () -> calculator.divide(4, 0));
//        assertThrows(RuntimeException.class, () -> calculator.divide(8, 0));
//    }
//
//    @Test
//    void exceptionTestingFirstWayByMessage(){
//        RuntimeException e;
//        e = assertThrows(RuntimeException.class, () -> calculator.divide(4,0));
//        assertTrue(e.getMessage().contains("divide by zero"));
//        e = assertThrows(RuntimeException.class, () -> calculator.divide(0,0));
//        assertTrue(e.getMessage().contains("divide by zero"));
//    }
//
//    @Test
//    void exceptionTestingSecondWay(){
//        RuntimeException e = null;
//        try {
//            calculator.divide(0,0);
//        }
//        catch (RuntimeException ex){
//            e = ex;
//        }
//        assertNotNull(e);
//        assertTrue(e.getMessage().contains("divide by zero"));
//    }


}