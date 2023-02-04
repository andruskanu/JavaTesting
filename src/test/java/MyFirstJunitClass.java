import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyFirstJunitClass {

    @Test
    public void firstTest(){
        System.out.println("Test");
    }

    @Test
    @DisplayName("This is a first attempt using assert equals methods")
    public void equalTest(){
        int a = 32;
        int b = 2;
        int actualResult = 32 * 2;
        int expectedResult = 64;
        int unexpectedResult = 10;

        System.out.println("equalTest");

        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
    }

    @Test
    public void assertNotNullTest(){
        String firstString = null;
        String secondString = "java";

        System.out.println("assertNotNullTest");

        assertNull(firstString);
        assertNotNull(secondString);
    }

    @Test
    public void assertTrueFalseTest(){
        boolean isBoy = true;
        boolean isGirl = false;

        System.out.println("assertTrueFalseTest");

        assertTrue(isBoy);
        assertFalse(isGirl);
    }

    @BeforeEach
    public void setUp(){
        System.out.println("This prints before each");
    }

    @AfterEach
    public void setUpAfter(){
        System.out.println("This prints AFTER each");
    }
}
