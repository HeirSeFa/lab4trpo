import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTests {

	@Test
	public void testSearch1() {
		assertEquals(Program.search(-2, 1), -2);
	}
	
	@Test
	public void testSearch2() {
		assertEquals(Program.search(15, 18), 18);
	}
	
	@Test
	public void testSearch3() {
		assertEquals(Program.search(18, 4), 18);
	}
	
	@Test
	public void testSearch4() {
		assertEquals(Program.search(-10, -5), -10);
	}
	
	@Test
	public void testSearch5() {
		assertEquals(Program.search(0, 1), 1);
	}
	
	@Test
	public void testSearch6() {
		assertEquals(Program.search(150, 151), 151);
	}
	
	@Test
	public void testSearch7() {
		Program.search(0, 1);
		assertEquals(Program.search(-235, 41), -235);
	}
	
	@Test
	public void testSearch8() {
		assertEquals(Program.search(100, 753), 753);
	}
	
	@Test
	public void testSearch9() {
		assertEquals(Program.search(-19, 2), -19);
	}
	
	@Test
	public void testSearch10() {
		assertEquals(Program.search(-25, -24), -25);
	}
}
