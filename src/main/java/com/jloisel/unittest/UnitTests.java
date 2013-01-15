package com.jloisel.unittest;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
import static org.fest.reflect.core.Reflection.constructor;

import org.fest.reflect.exception.ReflectionError;


/**
 * Utility methods for unit testing.
 * 
 * @author jerome
 *
 */
public final class UnitTests {

	private UnitTests() {
		throw new IllegalAccessError();
	}
	
	public static void assertNotInstantiable(final Class<?> clazz) {
		try {
			constructor().in(clazz).newInstance();
			fail("Class "+clazz+" should not be instantiable");
		} catch(final ReflectionError e) {
			assertEquals(IllegalAccessError.class, e.getCause().getClass());
		}
	}
}
