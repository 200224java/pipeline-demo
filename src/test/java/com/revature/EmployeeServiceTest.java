package com.revature;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.revature.services.EmployeeService;

public class EmployeeServiceTest {
	
	private EmployeeService es = null;

	@Before
	public void setUp() throws Exception {
		
		es = new EmployeeService();
	}

	@Test
	public void testFindAll() {
		assertTrue(es.findAll().size() >= 0);
	}

	@Test
	public void testFindById() {
		assertNull(es.findById(1));
	}
}
