package com.demo.guice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.inject.Guice;
import com.pa.gm.ApiModue;
import com.pa.gm.service.InjectorRegistry;

public class InjectorRegistryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		InjectorRegistry.getInstance().setClientServicesInjector(Guice.createInjector(new TestModue()));
	}

}
