package ze;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LinkedListTest {

	
	private LinkedList obj=new LinkedList();
	@Rule
    public ExpectedException exception = ExpectedException.none();

	
	@Before
	public void Add()
	{
		obj.headPointer=null;
		obj.numofElements=0;
		obj.pushFront(0);
		obj.add(1);
		obj.add(2);
		obj.add(3);
	}

	@Test
	public void testAdd() {
		//obj.add(4);
		int expected[]= {0,1,2,3};
		LinkedList point;
		point=obj.headPointer;
		int i=0;
		while(i!=expected.length)
		{
			assertEquals(point.data,expected[i]);
			point=point.nextPointer;
			i++;
		}
		
	}

	@Test
	public void testPushFront() {
		obj.pushFront(4);
		int expected[]= {4,0,1,2,3};
		LinkedList point;
		point=obj.headPointer;
		int i=0;
		while(i!=expected.length)
		{
			assertEquals(point.data,expected[i]);
			point=point.nextPointer;
			i++;
		}
	}

	@Test
	public void testTopFront() throws Exception {
		assertEquals(0,obj.topFront());
		exception.expect(Exception.class);
        exception.expectMessage("LinkedList is empty");
        obj.popFront();
        obj.popFront();
        obj.popFront();
        obj.popFront();
        obj.topFront();
        
	}

	@Test
	public void testPopFront() throws Exception {
		obj.popFront();
		//obj.popFront();
		obj.display();
		int expected[]= {1,2,3};
		LinkedList point;
		point=obj.headPointer;
		int i=0;
		while(i!=expected.length)
		{
			assertEquals(expected[i],point.data);
			point=point.nextPointer;
			i++;
		}
		exception.expect(Exception.class);
        exception.expectMessage("LinkedList is empty");
        obj.popFront();
        obj.popFront();
        obj.popFront();
        obj.popFront();
	}

	@Test
	public void testPushBack() {
		obj.pushBack(4);
		int expected[]= {0,1,2,3,4};
		LinkedList point;
		point=obj.headPointer;
		int i=0;
		while(i!=expected.length)
		{
			assertEquals(expected[i],point.data);
			point=point.nextPointer;
			i++;
		}
	}

	@Test
	public void testTopBack() throws Exception {
		assertEquals(3,obj.topBack());
		exception.expect(Exception.class);
        exception.expectMessage("LinkedList is empty!");
        obj.popFront();
        obj.popFront();
        obj.popFront();
        obj.popFront();
        obj.topBack();
	}

	@Test
	public void testSize() {
		assertEquals(4,obj.size());
	}

}
