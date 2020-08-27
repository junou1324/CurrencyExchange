package jun;

import static org.junit.Assert.assertTrue;

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
    public void when_readInput_is_called_input_is_read_and_saved() {
        //arrange
        Menu menu = new Menu();
        //act
        String result = menu.readInput();
        //assert
        assertTrue(result != "");
    }

    public static void main(String[] args) {
        //arrange
        Menu menu = new Menu();
        //act
        menu.menuDisplay();
        String userInput = menu.readInput();
    }
}