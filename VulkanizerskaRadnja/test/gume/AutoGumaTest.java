package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {
	private AutoGuma a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Mishelin");
		
		assertEquals("Mishelin",a.getMarkaModel());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		a.setMarkaModel("");
	}
	
	@Test 
	public void testSetPrecnik() {
		a.setPrecnik(20);
		
		assertEquals(20,a.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManjeOd13() {
		a.setPrecnik(12);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeceOd22() {
		a.setPrecnik(23);
	}
	
	@Test
	public void testSetSirina() {
		a.setSirina(200);
		
		assertEquals(200, a.getSirina());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManjeOd135() {
		a.setSirina(134);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManjeVeceOd355() {
		a.setSirina(356);
	}
	
	@Test 
	public void testSetVisina() {
		a.setVisina(50);
		
		assertEquals(50, a.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManjeOd25() {
		a.setVisina(24);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVeceOd95() {
		a.setVisina(96);
	}

	@Test
	public void testToString() {
		a.setMarkaModel("Mishelin");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		
		assertEquals("AutoGuma [markaModel=Mishelin, precnik=20, sirina=200, visina=50]", a.toString());
	}

	@Test
	public void testEqualsObjectTrue() {
		a.setMarkaModel("Mishelin");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Mishelin");
		a2.setPrecnik(20);
		a2.setSirina(200);
		a2.setVisina(50);
		
		assertTrue(a.equals(a2));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Mishelin");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Mishelin Guma");
		a2.setPrecnik(20);
		a2.setSirina(200);
		a2.setVisina(50);
		
		assertFalse(a.equals(a2));
	}
}
