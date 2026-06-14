package Collection;

import java.util.Arrays;

public class CheckforAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String one ="silent";
		String two ="listen";
		//System.out.println(one.toLowerCase());
		char[]arr1 = one.toCharArray();
		char[]arr2	=two.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1,arr2))
		{
			System.out.println("its an Anagram");
		}
		else
		{
			System.out.println("not an anagram");
		}

	}

}
