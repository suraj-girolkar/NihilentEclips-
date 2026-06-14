package Collection;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String one ="listen";
		String two="Silent";
		
		char[]arr1= one.toCharArray();
		char[]arr2= two.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Its anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}

	}

}
