package jun;

import static org.junit.Assert.assertFalse;

import java.util.Map;

import org.junit.Test;

public class XMLReaderTest {
    @Test
    public void when_getRates_is_called_shouldnt_return_empty_map(){
        //arrange
        XMLReader reader = new XMLReader();
        //act
        Map<String,Double> result = reader.getRates();
        //assert
        assertFalse("testing",result.isEmpty());
    }
}