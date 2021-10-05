package cerraduraElectronica;

import static org.junit.Assert.*;

import org.junit.Test;

public class CerraduraElectronicaTest {

	@Test
	public void alCreatLaCerraduraElectronicaEstaAbierta() {
		CerraduraElectronica cerradura = new CerraduraElectronica();
		assertTrue(cerradura.estaAbierta());
	}

}
