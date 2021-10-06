package Collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer>linkedItemList = new LinkedList<>();
		
		linkedItemList.add(4);
		linkedItemList.add(5);
		linkedItemList.add(6);
		linkedItemList.add(7);
		
		
		linkedItemList.add(0, 2);
		System.out.println("After adding Item on LinkedList");
		System.out.println(linkedItemList);
		
		linkedItemList.addLast(8);
		System.out.println("After adding LastItem on LinkedList");
		System.out.println(linkedItemList);
		
		linkedItemList.addFirst(3);
		System.out.println("After adding FirstItem on LinkedList");
		System.out.println(linkedItemList);
		
		linkedItemList.removeFirst();
		System.out.println("After Deleting FirstItem on LinkedList");
		System.out.println(linkedItemList);
		
		linkedItemList.removeLast();
		System.out.println("After Deleting LastItem on LinkedList");
		System.out.println(linkedItemList);
		
		linkedItemList.remove();
		System.out.println("After removing Item on LinkedList");
		System.out.println(linkedItemList);
		
		
		
		
		
		
				

	}

}
