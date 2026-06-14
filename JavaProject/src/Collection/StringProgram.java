package Collection;

public class StringProgram {

	public static void main(String[] args) {
		
	String abc ="THis is java, java is our National Language.java is India";
	String word="java";
	
	//String[]words= abc.split("\\W+");
	String [] words = abc.split("\\W+");
	int count=0;
	
	for(String w :words)
	{
		if(w.equals(word))
		{
			count++;
		}
	}
	
	System.out.println(count);
	
	
	}
	}