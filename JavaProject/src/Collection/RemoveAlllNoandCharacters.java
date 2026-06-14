package Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveAlllNoandCharacters {

	public static void main(String args[])
	{
		String og ="abBBc123ops";
		String letters = og.replaceAll("[0-9]","" );
		String number= og.replaceAll("[a-zA-Z]", "");
		System.out.println(letters);
		System.out.println(number);
	}}
	


