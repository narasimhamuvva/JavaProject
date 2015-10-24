package SaxParsing;

import java.util.HashMap;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserFile extends DefaultHandler {
	public static Map<String, String> map = new HashMap<String, String>();
    @Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (localName.equals("row")) 
		{

			map.put(attributes.getValue("Id"), attributes.getValue("DisplayName"));

			super.startElement(uri, localName, qName, attributes);
			
		}

	}

}