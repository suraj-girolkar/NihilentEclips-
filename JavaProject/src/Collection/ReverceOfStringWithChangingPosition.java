package Collection;

public class ReverceOfStringWithChangingPosition {
	
	
	public static void main(String[]args) 
	{
		String og = "I love India";
		String[]word = og.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String words : word)
		{
			String rev="";
			
			for(int i= words.length()-1;i>=0;i--)
			{
				rev+=words.charAt(i);
			}
			result.append(rev).append(" ");
		}	
		System.out.println(result);
	}
	

}
