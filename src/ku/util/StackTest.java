package ku.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

	private Stack stack;

	@Before
	public void resetStackToFiveSize(){
		//Set stack type to test ( 0 or 1 )
		StackFactory.setStackType(1);
		stack = StackFactory.makeStack(5);
	}

	@Test
	public void capacityTest() {
		assertEquals("Capacity must be 5.",5,stack.capacity());
		stack = StackFactory.makeStack(900);
		assertEquals("Capacity must be 900.",900,stack.capacity());
		stack = StackFactory.makeStack(100000000);
		assertEquals("Capacity must be 100000000.",100000000,stack.capacity());
		stack = StackFactory.makeStack(0);
		assertEquals("Capacity must be 0.",0,stack.capacity());
		assertTrue("Stack is empty must be true.",stack.isEmpty());
	}

	@Test
	public void isFullTest() {
		for(int i = 0 ; i < 5 ; i++){
			stack.push(i);
		}
		assertTrue("Stack is full must be true." , stack.isFull() );
	}

	@Test
	public void isEmptyTest() {
		assertTrue("Stack is empty must be true." , stack.isEmpty() );
	}

	@Test
	public void isNotFullTest(){
		assertFalse("Stack is full must be true." , stack.isFull() );
	}

	@Test
	public void sizePeekTest(){
		for(int i = 0 ; i < 5 ; i++){
			stack.push(i);
		}
		assertEquals( 4 , stack.peek() );
		assertEquals( 5 , stack.size() );
	}
	
	@Test
	public void sizeTest() {
		assertEquals( 0 , stack.size() );
		stack.push(1);
		assertEquals( 1 , stack.size() );
	}
	
	@Test
	public void sizePopTest() {
		for(int i = 0 ; i < 5 ; i++){
			stack.push(i);
		}
		assertEquals( 4 , stack.pop() );
		assertEquals( 4 , stack.size() );
	}

	@Test
	public void zeroSizeFullTest() {
		stack = StackFactory.makeStack(0);
		assertTrue("Stack is full must be true." , stack.isFull() );
	}

	@Test
	public void zeroSizeEmptyTest() {
		stack = StackFactory.makeStack(0);
		assertTrue( stack.isEmpty() );
	}

	@Test
	public void sameItemTest(){
		String[] hello = {"hello"};
		stack.push(hello);
		assertSame("Peeked item must be the same as the one that is pushed",hello, stack.peek());
		hello[0] = "hello2";
		stack.push(hello);
		assertSame(hello, stack.peek());
		assertSame(hello, stack.pop());
	}

	@Test ( expected = java.util.EmptyStackException.class )
	public void popEmptyTest() {
		stack = StackFactory.makeStack(0);
		stack.pop();
	}

	@Test ( expected = java.lang.IllegalArgumentException.class )
	public void pushNullTest() {
		stack.push(null);
	}

	@Test ( expected = java.lang.IllegalStateException.class )
	public void pushFullTest() {
		for(int i = 0 ; i <= 10 ; i++){
			stack.push(i);
		}
	}
	
	@Test ( expected = java.lang.IllegalStateException.class )
	public void pushZeroTest() {
		stack = StackFactory.makeStack(0);
		stack.push(" ");
		//		for(int i = 0 ; i < 2 ; i++){
//			stack.push(i);
//		}
	}
	
	@Test
	public void peekEmptyTest() {
		assertNull(stack.peek());
	}
	
}