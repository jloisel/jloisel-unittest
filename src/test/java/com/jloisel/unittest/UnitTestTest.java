package com.jloisel.unittest;

import static com.jloisel.unittest.UnitTests.assertNotInstantiable;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Tests  {@link UnitTests}.
 * 
 * @author jerome
 *
 */
public class UnitTestTest {

	@Test
	public void assertnotInstantiable() {
		assertNotInstantiable(UnitTests.class);
	}
	
	@Test(expected=AssertionError.class)
	public void assertInstantiable() {
		assertNotInstantiable(ArrayList.class);
	}
}
