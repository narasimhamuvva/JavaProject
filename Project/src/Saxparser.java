
import java.io.File;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Saxparser {
   public static void main(String[] args){

      try {	
         File inputFile = new File("/Users/narasimharaomuvva/Downloads/posts.xml");
         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser saxParser = factory.newSAXParser();
         UserHandler userhandler = new UserHandler();
         saxParser.parse(inputFile, userhandler);     
      } catch (Exception e) {
         e.printStackTrace();
      }
   }   
}

class UserHandler extends DefaultHandler {

   @Override
   public void startElement(String uri, 
      String localName, String qName, Attributes attributes)
         throws SAXException {
      if (qName.equalsIgnoreCase("row")) {
         String uid = attributes.getValue("Id");
         //String  ptid = attributes.getValue("PostTypeId");
         TreeSet<String> userid=new TreeSet<String>();
         userid.add(uid);
         Iterator<String> itr=userid.iterator();
         while(itr.hasNext())
         {
        	 System.out.println(itr.next());
         }
         
      } 
   }
}
