package Collection;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		java.util.HashMap<Integer,String> hm = new java.util.HashMap<Integer,String>();
		hm.put(101,"Suraj");
		hm.put(102,"Rahul");
		hm.put(103,"Akshatha");
		hm.put(104,"Dheeraj");
		
	
		//hm.clear();//it delets all the key and value
		System.out.println(hm.size());//prints the size 
		hm.remove(102);
		System.out.println(hm);// removes the valuse belongs to key 102
		System.out.println(hm.isEmpty());//returns if it is empty true or false
		System.out.println(hm.get(101));//returns the corresponding vlaue of key 101
			
		System.out.println(hm.keySet()); //gives keys
		System.out.println(hm.values());//returns values
		
		
		//Reading data using for each loop
		
		for(int k: hm.keySet())
		{
			System.out.println(k + " = "+hm.get(k));
		}
		

	}

}
