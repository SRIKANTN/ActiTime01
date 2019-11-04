package qsp;

import java.util.HashSet;

public class demo {

	public static void main(String[] args) 
	{
		// to craete the reference of set
		HashSet<String> hs = new HashSet<String>();
		// to add the elements to set
		hs.add("c");
		hs.add("b");		
		hs.add("d");	
		hs.add("a");		
		hs.add("d");
		hs.add("b");
		
		for(String s:hs)
		{
			System.out.println(s);
		}
		
		
		
		
		
		
		}

}
