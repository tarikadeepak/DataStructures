package com.datastructures.test;

import org.junit.Test;
import com.datastructures.MySet;
import junit.framework.TestCase;

public class MySetTest extends TestCase {

	@Test
	public void testAdd() {
		MySet myset = new MySet();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(4);
		assertTrue(myset.contains(2)==1); 
	}

	@Test
	public void testIsEmpty() {
		MySet myset = new MySet();
		assertTrue(myset.isEmpty());
		myset.add(1);
		assertFalse(myset.isEmpty());
	}

	@Test
	public void testLength() {
		MySet myset = new MySet();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(4);
		assertTrue(myset.length()==4); 
	}
	
	@Test
	public void testRemove() {
		MySet myset = new MySet();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(4);
		assertTrue(myset.length() ==4);
		myset.remove(2);
		assertTrue(myset.contains(2) ==-1);
		assertTrue(myset.length() ==3);
	}

}