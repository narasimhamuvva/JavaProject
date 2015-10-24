package src;
public class Permutations
{
	
public static void main(String args[]) 
{
	String string1="muvva";
	String string2="avvum";
	Permutation p=new Permutation();
	System.out.println(string1 +" and "+ string2 + " are permutation of each other? " + p.stringspermutation(string1, string2));
}

}