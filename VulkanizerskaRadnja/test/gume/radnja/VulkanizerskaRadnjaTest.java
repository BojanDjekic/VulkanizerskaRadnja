package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	private VulkanizerskaRadnja v;
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
		a.setMarkaModel("Lepa Guma");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		v = new VulkanizerskaRadnja();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
		v = null;
	}

	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		a = null;
		v.dodajGumu(a);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuContains() {
		v.dodajGumu(a);
		v.dodajGumu(a);
	}
	
	@Test
	public void testDodajGumu() {
		v.dodajGumu(a);
		LinkedList<AutoGuma> l = v.pronadjiGumu(a.getMarkaModel());
		assertEquals(a, l.getFirst());
	}
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null, v.pronadjiGumu(null));
	}

	@Test
	public void testPronadjiGumuNemaGume() {
		a.setMarkaModel("a2s2sd5s8sss");
		LinkedList<AutoGuma> lista = v.pronadjiGumu(a.getMarkaModel());
		
		assertEquals(0, lista.size());
	}
	
	@Test
	public void testPronadjiGumuJednaMarka() {
		AutoGuma a1 = new AutoGuma();
		a1.setMarkaModel("Lepa Guma");
		a1.setPrecnik(21);
		a1.setSirina(201);
		a1.setVisina(51);
		v.dodajGumu(a);
		v.dodajGumu(a1);
		LinkedList<AutoGuma> lista = v.pronadjiGumu(a.getMarkaModel());
		assertEquals(2, lista.size());
	}
	
	@Test
	public void testPronadjiGumu() {
		v.dodajGumu(a);
		LinkedList<AutoGuma> lista = v.pronadjiGumu(a.getMarkaModel());
		assertEquals(1, lista.size());
	}
}
