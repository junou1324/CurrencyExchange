package jun;

import java.util.Map;

public class Converter {

        private XMLReader reader;
        private Map<String,Double> rates;
        private Menu menu;

        public Converter() {
                this.reader = new XMLReader();
                this.rates = reader.getRates();
                this.menu = new Menu();
                menu.menuDisplay();
        }
	public Double convert() {
                Double result = null;
                Double euro = menu.readAmount();

                while(euro == null)
                {
                        euro = menu.readAmount();
                }
                
        try {
                //FIX Looping inputs
                String currencyInput = menu.readCurrency().toUpperCase(); 
                while(rates.get(currencyInput) == null) {
                        menu.readCurrency().toUpperCase();
                }
                double currentRate = rates.get(currencyInput);
        
                result = euro*currentRate;   
        } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Currency code is incorrect. Please enter a correct currency");
                convert();
        }
        return result;
        }
        

}
