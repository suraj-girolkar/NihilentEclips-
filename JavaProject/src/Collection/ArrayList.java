package Collection;

import java.lang.reflect.Array;
import java.util.Iterator;



public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.ArrayList mylist = new java.util.ArrayList();
		
		mylist.add("India");
		mylist.add("Australia");
		mylist.add("null");
		mylist.add("Java");
		mylist.add("Python");
		mylist.add("SQL");
		
		System.out.println(mylist);
		mylist.remove(1);
		System.out.println("After removing"+mylist);
		System.out.println("Size of arraylist="+mylist.size());
		mylist.add(1,"The indus water trity");
		System.out.println("After adding Pakistan "+mylist);
		System.out.println(mylist.get(3));
		
		//1st aproch to print all the list element- using normsl for loop
		
		for(int i=0; i<=mylist.size()-1;i++)
		{
			System.out.println(mylist.get(i));
		}
		
		//for each loop
		
		for(Object x : mylist)
		{
			System.out.println(x);
		}
		
		//iterator
		
		Iterator it = mylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println("iterator.."+it.next());
		}
		//check if list is emty of not
		
		System.out.println("is arraylist emty = "+mylist.isEmpty());
		java.util.ArrayList mylist2 = new java.util.ArrayList();
		mylist2.add("SQL");
		mylist2.add("Java");
		
		mylist.removeAll(mylist2);
		System.out.println("After removing SQL and Java="+mylist);
		
		mylist.clear();
		System.out.println("removing all the valurs in mylist="+mylist.isEmpty());
		
		
		
		
	}

}
