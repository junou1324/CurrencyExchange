package jun;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ConverterTest {
    @Test
    public void when_2euro_converts_to_2point3578_usd() {
        //arrange
        Converter converter = new Converter();
        //act
        double result = converter.convert(2);
        //assert
        assertTrue("rest",result == 2.3578);
    }
}