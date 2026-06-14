package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

class mobile
{
	String mobile;
	String OS;
	static String model="Smartphone";
	
	mobile(String mobile,String OS)
	{
		this.mobile=mobile;
		this.OS=OS;
	}
	
	public void display()
	{
		System.out.println(mobile+" : "+OS+" : "+model);
	}
	
}

public class Practice
{
	public static void main(String[]args)
	{
		mobile m1= new mobile("Iphone17","IOS");
		m1.display();
		
		mobile m2= new mobile("Iphone14","IOS26");
		m2.display();
	}

}