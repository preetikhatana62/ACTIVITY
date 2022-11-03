package com.home;

import java.util.HashMap;
//import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;





public class abc {
	public static void main(String[] args) {
		Map<Integer,String>queue=new HashMap<Integer,String>();
		queue.put(5,"preeti");
		queue.put(6,"shivani");
		queue.put(2,"khushi");
		queue.put(1,"snaju");
	//to remove map
		
	System.out.println("iterating map using entryset");
		Set<Integer> key=queue.keySet();
		Iterator<Integer>iterator=key.iterator();
		while(iterator.hasNext())
		{
			System.out.println((iterator.next()));
			
			
		}
		System.out.println("iterating using entryset");
Set<Entry<Integer,String>>entry=queue.entrySet();
for(Entry<Integer,String> s:entry)
{  Integer d=s.getKey();
  
String e=s.getValue();
System.out.println("key:"+d);
System.out.println("value:"+e);

	}
		

		
		    
	}

}
