package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingDuplicatecharacter {

	public static void main(String args[])
	{
		String og = "This is India proggrraammiinngg   ";
		
		Map<Character,Integer>map = new HashMap<>();
		
		for(char words : og.toCharArray())
		{
			if(words != ' ')
			{
				map.put(words,map.getOrDefault(words, 0)+1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer>entry: map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println("The duplicate letter are :"+entry.getKey()+"="+entry.getValue());
			}
		}
		
		
	}
				
		
	}
	
	
	 
	
		

		
		

	
