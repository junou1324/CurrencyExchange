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
                double euro = menu.readAmount();
        try {
                double currentRate = rates.get(menu.readCurrency().toUpperCase());
        
                result = euro*currentRate;   
        } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Currency code is incorrect. Please enter a correct currency");
                convert();
        }
        return result;
        }
        

}
