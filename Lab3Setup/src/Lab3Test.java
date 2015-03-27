import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Lab3Test {
	
	ArrayList<Integer> value = new ArrayList<Integer>();
	
	@Test
	public void testFor1() {
		assertEquals(Prime.primefactorization(1), value); 
	}
	
	@Test
	public void testFor2() {
		value.add(2);
		assertEquals(Prime.primefactorization(2), value);
	}
	
	@Test
	public void testFor3() {
		value.add(3);
		assertEquals(Prime.primefactorization(3), value);
	}
	
	@Test
	public void testFor4() {
		value.add(2);
		value.add(2);
		assertEquals(Prime.primefactorization(4), value);
	}
	
	@Test
	public void testFor6() {
		value.add(2);
		value.add(3);
		assertEquals(Prime.primefactorization(6), value);
	}
	
	@Test
	public void testFor8() {
		value.add(2);
		value.add(2);
		value.add(2);
		assertEquals(Prime.primefactorization(8), value);
	}

}
