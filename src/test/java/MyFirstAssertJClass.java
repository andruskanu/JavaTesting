import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MyFirstAssertJClass {

    @Test
    public void assertJNumberTest(){
        //given
        Calculator calculator = new Calculator();
        //when
        Double actualResult = calculator.add(2,5);
        //then
        assertThat(actualResult)
                .isEqualTo(7d)
                .isNotEqualTo(9d)
                .isLessThan(15d)
                .isGreaterThan(2d)
                .isNotZero()
                .isIn(3d,4d,5d,6d,7d,8d);
    }

    @Test
    public void assertJStringTest(){
        //
        //
        String actualResult = "Java";
        //then
        assertThat(actualResult)
                .startsWith("J")
                .endsWith("a")
                .isEqualTo("Java")
                .isEqualToIgnoringCase("JAVA")
                .isIn("Php", "Java", "Python")
                .isNotNull()
                .isNotBlank()
                .isNotEmpty()
                .doesNotContain("x")
                .isExactlyInstanceOf(String.class);
    }
}
