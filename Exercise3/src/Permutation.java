package src;
import java.util.Hashtable;
import java.util.Set;

public class Permutation {
	
	public boolean stringspermutation(String string1,String string2)
	{
		if (string1.length()!=string2.length())
		{
			return false;
		}
		Hashtable<Character, Integer> ht=new Hashtable<Character, Integer>();
		for (int i=0;i<string1.length();i++)
		{
			char c=(char)string1.charAt(i);
			if(ht.containsKey(c))
			{
				int val= (int)ht.get(c)+1;
				ht.put(c, val);
			}else
			{
				ht.put(c, 1);
			}
			
		}
		for (int i=0;i<string2.length();i++)
		{
			char c=(char)string2.charAt(i);
			if(ht.containsKey(c))
			{
				int val=(int) ht.get(c);
				if (val==0)
				{
					return false;
				}
				val--;
				ht.put(c, val);
			}
		else
			{
			return false;
			}
			
		}
		Set<Character>  keys=ht.keySet();
		for(Object k:keys)

		{
			if((int)ht.get(k)!=0)
		{
			return false;
		}
		
	
		}
		return true;
	}
}
