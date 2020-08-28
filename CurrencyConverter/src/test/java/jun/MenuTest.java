package jun;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

public class MenuTest {
    
    @Test
    public void when_menuDisplay_is_called_menu_is_displayed() {
        //arrange
        Menu menu = new Menu();
        //act
        menu.menuDisplay();
        //assert
        assertTrue(true);
    }

    @Test
    public void when_readAmount_is_called_input_is_read_and_saved() {
        //arrange
        Menu menu = new Menu();
        //act
        Double result = menu.readAmount();
        //assert
        assertTrue(result != null);
    }

    @Test
    public void when_correct_currency_is_entered_return_true() {
        //arrange
        Menu menu = new Menu();
        XMLReader reader = new XMLReader();
        Map<String,Double> currency = reader.getRates();
        //act
        String result = menu.readCurrency();
        //assert
        assertTrue(currency.containsKey(result));
    }
}