package ze;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayTest {

	private Array atest=new Array();
			

	@Before
	public void Insert() {
		atest.insert(3, 0);
		atest.insert(1, 1);
		atest.insert(2, 2);
		atest.insert(0, 3);
		
	}
	
	@Test
	public void testInsert() {
		atest.insert(4, 4);
		int expected[]= {3,1,2,0,4};
		assertEquals(expected.length,atest.size);
		int size=expected.length;
		for(int i=0;i<size;i++)
			assertEquals(expected[i],atest.array[i]);
	}
	@Test
	public void testDelete() {
		atest.delete(2);
		
		int expected[]= {3,1,0};
		assertEquals(expected.length,atest.size);
		int size=expected.length;
		for(int i=0;i<size;i++)
			assertEquals(expected[i],atest.array[i]);
	}

	
	//@Before
	@Test
	public void testLinearSearch() {
		assertEquals("linear search is ",true,atest.linearSearch(0));
		assertFalse("linear search is ",atest.linearSearch(9));
	}

	@Test
	public void testBubbleSort() {
		atest.bubbleSort();
		atest.display();
		int expected[]= {0,1,2,3};
		assertEquals(expected.length,atest.size);
		int size=expected.length;
		for(int i=0;i<size;i++)
			assertEquals(expected[i],atest.array[i]);
	}

	@Test
	public void testBinarySearch() {
		
		atest.display();
		assertTrue(atest.binarySearch(2, 0, atest.size));
		assertFalse(atest.binarySearch(2, 10, atest.size));
		
	}
	@Test
	public void testBinarySearch1() {
		
		atest.display();
		assertFalse(atest.binarySearch(0, 0, atest.size));
		
		
	}

}
