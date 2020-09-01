package jun;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLReader {

    private Map<String,Double> currency;

    public XMLReader() {
        this.currency = new HashMap<String,Double>();
    }

    public Map<String,Double> getRates() {
        try{
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new URL("https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml").openStream());
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Cube");

            for(int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                Element eElement = (Element) nNode;
                String country = eElement.getAttribute("currency");
                String rate = eElement.getAttribute("rate");
                
                if(rate.length() > 0 && country.length() >0) {
                    currency.put(country,Double.parseDouble(rate));
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
        return currency;
    }
    
}
