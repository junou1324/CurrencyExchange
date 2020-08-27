package jun;

import java.util.Map;

public class Converter {

	public double convert(double amount) {
        XMLReader reader = new XMLReader();
        Map<String,Double> rates = reader.getRates();
        double euro = 2;
        double currentRate = rates.get("USD");

        double result = euro*currentRate;

        return result;
	}

}
