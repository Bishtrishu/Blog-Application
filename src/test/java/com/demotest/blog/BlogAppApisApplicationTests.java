package com.demotest.blog;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BlogAppApisApplicationTests {

	private demo d= new demo();
	@Test
	void contextLoads() {
	
	}
	
	@Test
	void testSum() {
		int expectedResult=24;
		
		int actualResult=d.doSum(3, 10, 11);
		
		assertThat(actualResult).isEqualTo(expectedResult);
	
	
	}
	
	@Test
	void testProduct() {
		int expectedResult=30;
		
		int actualResult=d.doProduct(3, 10);
		
		assertEquals(actualResult, expectedResult);
	
	}
	
	@Test
	void TestCompareNums() {
		
		Boolean actualResult=d.compareTwoNumbers(3, 3);
		
		assertThat(actualResult).isTrue();
	
	}
	
	
	

}
