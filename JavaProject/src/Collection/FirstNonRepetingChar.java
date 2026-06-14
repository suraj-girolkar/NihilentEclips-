package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="aabbccdeeerrffg";
		char result = FirstNonRepetingChar(str);
		
		if(result !=0)
		{
			System.out.println("the first non repitative character is = "+result);
		}
		else
		{
			System.out.println("No Repitative character found");
		}
	}
		 public static  char FirstNonRepetingChar(String str)
		 {
			 Map<Character, Integer>map = new LinkedHashMap<>();
			 for(char words : str.toCharArray())
			 {
				 map.put(words,map.getOrDefault(words,0)+1);
			 }
			 for(Map.Entry<Character, Integer>entry: map.entrySet())
			 {
				 if(entry.getValue()==1)
				 {
					 return entry.getKey();
				 }
			 }
			return 0;
			 
		
		 }

}
