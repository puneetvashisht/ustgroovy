package com.ust.testsample

import static org.junit.Assert.*

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(Parameterized)
class AnotherGroovyTestCase {
	def testee 
	def param 
	def expected
	

	AnotherGroovyTestCase(a, b) { 
		param = a
		expected = b }
	
	@Before 
	void setUp() {
		testee = new AnotherGroovyTestCase();
	}

	
	@Parameters 
	static data() {
		return (1..5).collect{
			[it, it * 3] as Integer[]
		}
	}
	
	
	@Test 
	void positivesFixed() 
	{ 
		assert testee.triple(1) ==3
	}
	@Test 
	void positivesParameterized() {
		assert testee.triple(param) == expected
		
	//		assert 2.triple == 6
	//		assert 3.triple == 9
	//		assert 4.triple == 12
	}
}
