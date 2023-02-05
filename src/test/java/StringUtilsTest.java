import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void getWordInCapitalLettersTest() {
        //given
        String userWord = "java";
        String expectedResult = "JAVA";
        String unexpectedResult = "jAvA";
        //when
        String actualResult = StringUtils.getWordInCapitalLetters(userWord);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNotNull(actualResult);
    }

    @Test
    public void getWordInCapitalLettersWithNullValueTest() {
        //given
        String userWord = null;
        String expectedResult = null;
        //when
        String actualResult = StringUtils.getWordInCapitalLetters(userWord);
        //then
        assertEquals(expectedResult, actualResult);
        assertNull(actualResult);
    }

    @Test
    public void convertToDoubleTest() {
        String givenValue = "123";
        Double expectedResult = 123d;
        Double unexpectedResult = 124d;

        Double actualResult = StringUtils.convertToDouble(givenValue);

        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNotNull(actualResult);
    }

    @Test
    public void convertToDoubleIfStringIsNullTest() {
        String givenValue = null;
        Double expectedResult = null;
        Double unexpectedResult = 124d;

        Double actualResult = StringUtils.convertToDouble(givenValue);

        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNull(actualResult);
    }

    @Test
    public void isNullBlankOrEmptyTest() {
        String givenValue = null;
        boolean expectedResult = true;

        boolean actualResult = StringUtils.isNullBlankOrEmpty(givenValue);

        assertEquals(expectedResult, actualResult);
        assertTrue(actualResult);
    }

    @Test
    public void isNullBlankOrEmptyWithEmptyStringTest() {
        String givenValue = "";
        boolean expectedResult = true;

        boolean actualResult = StringUtils.isNullBlankOrEmpty(givenValue);

        assertEquals(expectedResult, actualResult);
        assertTrue(actualResult);
    }

    @Test
    public void isNullBlankOrEmptyWithBlankStringTest() {
        String givenValue = "  ";
        boolean expectedResult = true;

        boolean actualResult = StringUtils.isNullBlankOrEmpty(givenValue);

        assertEquals(expectedResult, actualResult);
        assertTrue(actualResult);
    }

    @Test
    public void isNullBlankOrEmptyWithWordTest() {
        String givenValue = "java";
        boolean expectedResult = false;

        boolean actualResult = StringUtils.isNullBlankOrEmpty(givenValue);

        assertFalse(actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getDefaultIfNullTest() {
        String givenMyText = null;
        String givenDefaultText = "java";
        String expectedResult = "java";

        String actualResult = StringUtils.getDefaultIfNull(givenMyText, givenDefaultText);

        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getDefaultWithNotNullValueTest() {
        String givenMyText = "java";
        String givenDefaultText = "anything";
        String expectedResult = "java";

        String actualResult = StringUtils.getDefaultIfNull(givenMyText, givenDefaultText);

        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void concatWithNullArrayTest() {
        String[] givenStringArray = null;
        String expectedResult = null;

        String actualResult = StringUtils.concat(givenStringArray);

        assertEquals(expectedResult, actualResult);
        assertNull(actualResult);
    }

    @Test
    public void concatWithEmptyArrayTest() {
        String[] givenStringArray = {};
        String expectedResult = null;

        String actualResult = StringUtils.concat(givenStringArray);

        assertEquals(expectedResult, actualResult);
        assertNull(actualResult);
    }

    @Test
    public void concatWithFullArrayTest() {
        String[] givenStringArray = {"java", ":", "php"};
        String expectedResult = "java:php";

        String actualResult = StringUtils.concat(givenStringArray);

        assertEquals(expectedResult, actualResult);
        assertNotNull(actualResult);
    }

    @Test
    public void concatWithArrayHavingANullValueTest() {
        String[] givenStringArray = {"java", ":", null, "php"};
        String expectedResult = "java:php";

        String actualResult = StringUtils.concat(givenStringArray);

        assertEquals(expectedResult, actualResult);
        assertNotNull(actualResult);
    }
}
