package ze;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Test;

public class QueueTest {
	
	private Queue obj =new Queue(3);
	@Rule
    public ExpectedException exception = ExpectedException.none();

	@Before
	public void Enqueue() throws Exception
	{
		obj.enqueue(4);
		obj.enqueue(6);
		obj.enqueue(2);
		
	}
	@Test
	public void testEnqueue() throws Exception {
		int expectedarr[]= {4,6,2};
		assertEquals(expectedarr.length,obj.sizeofQueue);
		for(int i=0;i<expectedarr.length;i++)
			assertEquals(expectedarr[i],obj.array[i]);
		exception.expect(Exception.class);
        exception.expectMessage("Cannot enqueue, Queue is full");
        obj.enqueue(0);
			obj.enqueue(2);
	}

	@Test
	public void testDequeue() throws Exception {
		assertEquals(4,obj.dequeue());
		exception.expect(Exception.class);
        exception.expectMessage("Cannot remove, Queue is Empty");
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
	}

	@Test
	public void testEmpty() throws Exception {
		assertFalse(obj.empty());
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		assertTrue(obj.empty());
	}

	@Test
	public void testSize() {
		assertEquals(3,obj.size());
	}

}
