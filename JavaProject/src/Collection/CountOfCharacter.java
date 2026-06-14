package Collection;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharacter {

	public static void main(String[] args) {
		
		
		String input ="abcwerabc";
		
		HashMap<Character,Integer> CharCount = new HashMap<>();
		
		for(char c : input.toCharArray())
		{
			if(CharCount.containsKey(c))
			{
				CharCount.put(c, CharCount.get(c)+1);
				
			}
			else
			{
				CharCount.put(c, 1);
			}
		}

		System.out.println("Unique characters:");
        for (Map.Entry<Character, Integer> entry : CharCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("'" + entry.getKey() + "'");
	}

}}}
