import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Lab3Test {
	
	ArrayList<Integer> value = new ArrayList<Integer>();
	
	@Test
	public void testFor1() {
		assertEquals(value, Prime.primefactorization(1)); 
	}
	
	@Test
	public void testFor2() {
		value.add(2);
		assertEquals(value, Prime.primefactorization(2));
	}
	
	@Test
	public void testFor3() {
		value.add(3);
		assertEquals(value, Prime.primefactorization(3));
	}
	
	@Test
	public void testFor4() {
		value.add(2);
		value.add(2);
		assertEquals(value, Prime.primefactorization(4));
	}
	
	@Test
	public void testFor6() {
		value.add(2);
		value.add(3);
		assertEquals(value, Prime.primefactorization(6));
	}
	
	@Test
	public void testFor8() {
		value.add(2);
		value.add(2);
		value.add(2);
		assertEquals(value, Prime.primefactorization(8));
	}
	
	@Test
	public void testFor9() {
		value.add(3);
		value.add(3);
		assertEquals(value, Prime.primefactorization(9));
	}

}
