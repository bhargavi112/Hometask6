package com.epam.collection_project;

public class Collection1 {

	public static void main(String[] args) {
		Collection<Integer> c=new Collection<>();
        c.insert(1);
        c.insert(2);
        c.insert(3);
        c.insert(4);
        System.out.println(c);
        c.remove(3);
        System.out.println(c);
        System.out.println(c.fetch(0));
        System.out.println(c.fetch(1));
        System.out.println(c.array());
	}

}
