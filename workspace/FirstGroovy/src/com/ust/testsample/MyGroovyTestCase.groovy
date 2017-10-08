package com.ust.testsample
import org.junit.Test
import static org.junit.Assert.assertEquals
import org.junit.runner.JUnitCore;

class MyGroovyTestCase{
	
	@Test
	void anyMethod(){
		println "test csomething"
//		def fac(n) { n == 0 ? 1 : n * fac(n - 1) }; 
		assertEquals 4, 2+2 
	}
}
