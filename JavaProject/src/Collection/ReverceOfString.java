package Collection;

import java.util.Scanner;

public class ReverceOfString {

	
	public static void main(String[]args)
	{
		 
        String word = "Java is National Language";
        String rev = " ";
        
        for(int i= word.length()-1;i>=0;i--)
        {
            rev= rev+word.charAt(i);
        }
        System.out.println(rev);
	}
}
