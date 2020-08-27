package jun;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {

	private String userInput;

    public void menuDisplay() {
        System.out.println("Welcome to Currency Exchange");
        System.out.println("This program converts EURO to any currency");
	}

	public String readInput() {

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            userInput = in.readLine();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInput;
	}

}
