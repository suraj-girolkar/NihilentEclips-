package Collection;
import java.util.*;

public class RemoveDuplicateCharacter {
	  public static void main(String[] args) {
	      String og = "Proggrammingggggg is the god partical";
	      
	      StringBuilder result = new StringBuilder();
	      HashSet<Character> seen = new HashSet<>();
	      
	      for(char ch : og.toCharArray())
	      {
	    	  if(!seen.contains(ch))
	    	  {
	    		  seen.add(ch);
	    		  result.append(ch);
	    	  }
	    	
	      }
	      System.out.println(result);
	      
	      
	      
	  }}