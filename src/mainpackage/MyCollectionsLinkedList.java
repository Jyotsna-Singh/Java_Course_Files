package mainpackage;

import java.util.Iterator;
import java.util.LinkedList;

public class MyCollectionsLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ls=new LinkedList<String>();
		ls.add("Jyotsna");
		ls.add("Luna");
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
