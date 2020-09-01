package jun;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {


    public void menuDisplay() {
        System.out.println("Welcome to Currency Exchange");
        System.out.println("This program converts EURO to any currency");
        
    }

	public Double readAmount() {
        Double userInput = null;
        BufferedReader in ;
        try {
            System.out.print("Please Enter euro amount:");
            in = new BufferedReader(new InputStreamReader(System.in));
            userInput = Double.parseDouble(in.readLine());
        } catch (Exception e) {
            System.out.println("ERROR");
            return null;
        }
        return userInput;
	}

	public String readCurrency() {
        String userInput = new String();
        try {
            System.out.print("Enter currency to convert to:");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            userInput = in.readLine();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		return userInput;
	}

}
