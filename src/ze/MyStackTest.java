package ze;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MyStackTest {
	private MyStack obj=new MyStack(4);
	@Rule
    public ExpectedException exception = ExpectedException.none();
	
	@Before
	public void Push() throws Exception
	{
		obj.push(4);
		obj.push(7);
		obj.push(9);
		obj.push(2);
	}
	@Test
	public void testPush() throws Exception {
		//
		int expectedarr[]= {4,7,9,2};
		assertEquals(expectedarr.length,obj.size());
		for(int i=0;i<expectedarr.length;i++)
			assertEquals(expectedarr[i],obj.arraytostoreStack[i]);
		exception.expect(Exception.class);
        exception.expectMessage("Cannot push,Stack is full");
        obj.push(5);
	}

	@Test
	public void testTop() throws Exception {
			assertEquals(2,obj.top());
			obj.pop();
			obj.pop();
			obj.pop();
			obj.pop();
			exception.expect(Exception.class);
	        exception.expectMessage("Stack is empty.");
	         
	        obj.top();
	}
	
     
	@Test
	public void testPop() throws Exception {
		assertEquals(2,obj.pop());
		obj.pop();
		obj.pop();
		obj.pop();
		exception.expect(Exception.class);
        exception.expectMessage("Cannot pop,Stack is empty.");
         
        obj.pop();
	   
	 
	    
	}

	@Test
	public void testSize() {
		assertEquals(4,obj.size());
	}

}
