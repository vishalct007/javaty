package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;


public class ListExample {

	public static void main(String[] args) {
	/*	ArrayList <Object> arraylist=new ArrayList<Object>();
		arraylist.add("Hi");
		arraylist.add(10);
		arraylist.add(null);
		arraylist.add(null);
		System.out.println(arraylist);
		
		ArrayList <Integer> intArrayList=new ArrayList<Integer>();
		intArrayList.add(10);
		intArrayList.add(30);
		intArrayList.add(5);
		intArrayList.add(25);
		intArrayList.add(5);
		
		System.out.println(intArrayList);
		Collections.sort(intArrayList);
		System.out.println(intArrayList);
		
		arraylist.addAll(intArrayList);
		System.out.println(arraylist);
		
		if(arraylist.contains("hi")) {
			System.out.println("present");	
		}
		
		else {
			System.out.println("absent");
		}
		
		for(Object alladata:arraylist) {
			System.out.println(alladata);
		}
		
		Iterator<Object>it=arraylist.iterator();
		while(it.hasNext())
		{
			Object alldata=it.next();
		}
		
		System.out.println(arraylist.get(5));
		System.out.println(arraylist.size());
		System.out.println(arraylist.indexOf(10));
		System.out.println(arraylist.lastIndexOf(10));
		
		PriorityQueue<Object> pq=new PriorityQueue<Object>();
		pq.add(10);
		pq.add(20);
		
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);*/
		
		
		/*HashSet<Object>hs=new HashSet<Object>();
		hs.add(null);
		hs.add("smruti");
		hs.add("ashwin");
		hs.add("archi");
		System.out.println(hs.add(null));
		System.out.println(hs);*/
		
		/*TreeSet<Object>ts=new TreeSet<Object>();
		ts.add(10);
		ts.add(300);
		ts.add(20);
		ts.add(50);
		System.out.println(ts);*/
		
	/*	Hashtable<Integer, String> hashtable= new Hashtable<Integer, String>();
		hashtable.put(1,"smr");
		hashtable.put(2,"ash");
		hashtable.put(3,"vis");
		hashtable.put(4,"arc");
		hashtable.put(1,"smru");
		hashtable.put(5,"sm");
		System.out.println(hashtable);*/
		
		
		HashMap<Integer, String> hashmap= new HashMap<Integer, String>();
		hashmap.put(1,"smr");
		hashmap.put(2,"ash");
		hashmap.put(6,"vis");
		hashmap.put(4,"arc");
		hashmap.put(null,"smru");
		hashmap.put(1,"sm");
		System.out.println(hashmap);
		for(Entry<Integer, String> entry:hashmap.entrySet()){
			System.out.println(entry.getKey()+ entry.getValue());
			
		}
		
		LinkedHashMap<Integer, String> linkedHashmap= new LinkedHashMap<Integer, String>();
		linkedHashmap.put(1,"smr");
		linkedHashmap.put(2,"ash");
		linkedHashmap.put(6,"vis");
		linkedHashmap.put(4,"arc");
		linkedHashmap.put(null,"smru");
		linkedHashmap.put(1,"sm");
		System.out.println(linkedHashmap);
		for(Entry<Integer, String> entry:linkedHashmap.entrySet()){
			System.out.println(entry.getKey()+ entry.getValue());
			
		}

		
		TreeMap<Integer, String> treemap= new TreeMap<Integer, String>();
		treemap.put(1,"smr");
		treemap.put(2,"ash");
		treemap.put(6,"vis");
		treemap.put(4,"arc");
		treemap.put(null,"smru");
		treemap.put(1,"sm");
		System.out.println(hashmap);
		for(Entry<Integer, String> entry:treemap.entrySet()){
			System.out.println(entry.getKey()+ entry.getValue());
			
		}
	}

}
