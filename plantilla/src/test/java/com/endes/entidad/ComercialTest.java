package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComercialTest {
	private Comercial comercial;
	
	@BeforeEach
	void testComercial() {
        this.comercial = new Comercial("11111111H", "Alejandro", "Fernández", 1000.0, 1);
	}
	@Test
	void testGetVentas() {
		assertEquals(1, comercial.getVentas());
	}
	@Test
	void testSetVentas() {
		
	}
	@Test
	void testCalcularExtra() {
		
	}
	@Test
	void testGetSueldo() {
		
	}
}
