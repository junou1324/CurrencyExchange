package jun;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ConverterTest {
    @Test
    public void when_2euro_converts_to_2point3578_usd() {
        //arrange
        Converter converter = new Converter();
        //act
        double result = converter.convert();
        //assert
        assertTrue("rest",result == 2.3578);
    }

    @Test
    public void when_converter_is_initiated_menu_displays() {
        //arrange
        Converter converter = new Converter();
        //act
        //assert
    }

    public static void main(String[] args) {
        boolean finish = false;
        while(finish == false) {

            try {
                Converter converter = new Converter();
                System.out.println(converter.convert());
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                finish = true;
            }

        }
    }
}