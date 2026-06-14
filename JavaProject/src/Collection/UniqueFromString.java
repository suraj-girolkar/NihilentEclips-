package Collection;

import java.util.HashMap;
import java.util.Map;

public class UniqueFromString {
	
	public static void main(String[]args)
	{
		String elemnt ="I love love India";
		String[] words = elemnt.split("\\W+");
		//System.out.println(words);
		
		Map<String, Integer>map = new HashMap<>();
		for(String word : words)
		{
			map.put(word,map.getOrDefault(word,0)+1);
		} 
		
		System.out.println("Unique value is :");
		
		for(Map.Entry<String,Integer>entry : map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
			}
		}
		
		
	}
	

}
