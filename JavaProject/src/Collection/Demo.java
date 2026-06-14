package Collection;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String og = "Java is java,India is java";
		String word="Java";
		
		String words = og.toLowerCase();
		
		String []w = words.split("\\W+");
		
		int count=0;
		for(String words2:w)
		{
			if(words2.equals(word))
			{
				count++;
			}
			System.out.println(count);
		}
		
		
		
	}

}
