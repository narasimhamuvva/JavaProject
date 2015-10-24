
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class DomParser {

  public static void main(String args[]) throws SAXException, IOException, ParserConfigurationException{

    

	File PostFile1 = new File("/Users/narasimharaomuvva/Downloads/posts.xml");
	File UserFile1 = new File("/Users/narasimharaomuvva/Downloads/users.xml");
	
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(PostFile1);
	Document doc1 = dBuilder.parse(UserFile1);
	doc.getDocumentElement().normalize();
	PostFile.owneruserid(doc);
    
	Sort sorting = new Sort();
	Count count = new Count();

	HashMap<String, Integer> stringsCountQuestions = count.countof(PostFile.Questions);
	HashMap<String, Integer> stringsCountAnswers = count.countof(PostFile.Answers);
	
	List<String> top10QuestionUsers = sorting.sortingByValue(stringsCountQuestions);
	List<String> top10AnswerUsers = sorting.sortingByValue(stringsCountAnswers);

	Map<String, String> map =  UserFile.handler(doc1);

	LinkedList<String> questionUsers = new LinkedList<String>();
	LinkedList<String> answerUsers = new LinkedList<String>();

	for (String s : top10QuestionUsers) {
		questionUsers.add(map.get(s));
	}
	System.out.println("The top 10 users who ask questions are : " + questionUsers);

	for (String s : top10AnswerUsers) {
		answerUsers.add(map.get(s));
	}
	System.out.println("The top 10 users who answered questions are : " + answerUsers);
    
  }
}
    



  
    
    
  
  

