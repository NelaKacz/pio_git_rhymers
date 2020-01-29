package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RhymersJUnitTest {

	DefaultCountingOutRhymer rhymer;

	@Before
	public void setUp() {
		rhymer = new DefaultCountingOutRhymer();
	}

	@Test
	public void testCountIn() {
		int testValue = 4;
		rhymer.countIn(testValue);

		Assert.assertEquals(testValue, rhymer.peekaboo());
	}

	@Test
	public void testCallCheck() {
		Assert.assertTrue(rhymer.callCheck());

		rhymer.countIn(888);

		Assert.assertFalse(rhymer.callCheck());
	}

	@Test
	public void testIsFull() {
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			Assert.assertFalse(rhymer.isFull());
			rhymer.countIn(888);
		}

		Assert.assertTrue(rhymer.isFull());
	}

	@Test
	public void testPeekaboo() {
		final int EMPTY_STACK_VALUE = -1;

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.peekaboo());

		int testValue = 4;
		rhymer.countIn(testValue);

		Assert.assertEquals(testValue, rhymer.peekaboo());
	}

	@Test
	public void testCountOut() {
		final int EMPTY_STACK_VALUE = -1;

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());

		int testValue = 4;
		rhymer.countIn(testValue);

		Assert.assertEquals(testValue, rhymer.countOut());
		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
	}
}
