package SaxParsing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class Main {

	public static void main(String[] args) throws SAXException, IOException {
		XMLReader postReader = XMLReaderFactory.createXMLReader();
		XMLReader UsersReader = XMLReaderFactory.createXMLReader();

		postReader.setContentHandler(new PostFile());
		UsersReader.setContentHandler(new UserFile());

		postReader.parse("/Users/narasimharaomuvva/Downloads/posts.xml");
		UsersReader.parse("/Users/narasimharaomuvva/Downloads/users.xml");

		Sort sorting = new Sort();
		Count count = new Count();

		HashMap<String, Integer> stringsCountQuestions = count.count(PostFile.questions);
		HashMap<String, Integer> stringsCountAnswers = count.count(PostFile.answers);

		List<String> top10QuestionUsers = sorting.sortingByValue(stringsCountQuestions);
		List<String> top10AnswerUsers = sorting.sortingByValue(stringsCountAnswers);
		//System.out.println(top10QuestionUsers);
		List<String> questionUsers = new ArrayList<String>();
		List<String> answerUsers = new ArrayList<String>();

		for (String s : top10QuestionUsers) {
			questionUsers.add(UserFile.map.get(s));
		}
		System.out.println("The top 10 users who asked questions are : " + questionUsers);

		for (String s : top10AnswerUsers) {
			answerUsers.add(UserFile.map.get(s));
		}
		System.out.println("The top 10 users who answered the questions are : " + answerUsers);

	}

}