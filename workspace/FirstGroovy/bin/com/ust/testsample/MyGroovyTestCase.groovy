package com.ust.testsample
import groovy.util.GroovyTestCase;

class MyGroovyTestCase extends GroovyTestCase{
	void testMethod(){
		println "test csomething"
//		def fac(n) { n == 0 ? 1 : n * fac(n - 1) }; 
		assert 2 == 3
	}
}
