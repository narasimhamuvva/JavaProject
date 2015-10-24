import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PostFile
{
	
    public static ArrayList<String> Questions;
	public static ArrayList<String> Answers;

	public static void owneruserid(Document document)
    
    {
    	String PostTypeId ;
        String OwnerUserId ;
    	HashMap <String ,Integer> questions=new HashMap<String ,Integer>();
        HashMap <String ,Integer> answers=new HashMap<String ,Integer>();
    	NodeList nList = document.getElementsByTagName("row");
    	for (int temp = 0; temp < nList.getLength(); temp++) {

    		Node nNode = nList.item(temp);
    				
           if (nNode.getNodeType() == Node.ELEMENT_NODE) {

    			Element element = (Element) nNode;
    			
                OwnerUserId=element.getAttribute("OwnerUserId");
                PostTypeId=element.getAttribute("PostTypeId");
                
    			
    			if(PostTypeId=="1")
    		    {
    				
    		    	if(questions.containsKey(OwnerUserId))
    		    	{
    		    		int val=questions.get(OwnerUserId)+1;
    		    		questions.put(OwnerUserId, val);
    		    	}
    		    	else
    		    		questions.put(OwnerUserId, 1);
    		    }else
    		    	if(answers.containsKey(OwnerUserId))
    		    	{
    		    		int val=answers.get(OwnerUserId)+1;
    		    		questions.put(OwnerUserId, val);
    		    	}
    		    	else
    		    		answers.put(OwnerUserId, 1);
    		}
    	
    }
    	
    		
    	
    	Questions=new ArrayList<String>(questions.keySet());
    	
    	Questions.add("OwnerUserId");
    	
    	Answers=new ArrayList<String>(answers.keySet());
    	Answers.add("OwnerUserId");
    
    	
    
    //System.out.println(questions.size()+" "+answers.size());
}
}
    

	
	