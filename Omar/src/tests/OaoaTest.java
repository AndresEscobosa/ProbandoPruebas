package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import paquetenormal.Oaoa;

class OaoaTest {

	@Test
	void test() {
		Oaoa omi= new Oaoa(19);
		assertEquals(38,omi.dobleEdad(19));
		
		omi.setApodo("omarcin");
		assertEquals("omarcin",omi.getApodo());
		assertEquals(false,omi.toString().isEmpty());
		
	}

}
