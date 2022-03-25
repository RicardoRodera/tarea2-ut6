import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeneradorIpTest {
	GeneradorIp gen = new GeneradorIp();

	@Test
	void testGenerarNumero() {
		int numero = 0;
		for (int i = 0; i < 1000; i++) {
			numero = gen.generarNumero(0, 254);
			assertTrue(numero >= 0);
			assertTrue(numero <= 254);
		}
	}

	@Test
	void testGeneraIp() {
		String ip = gen.generarIp();
		System.out.println(ip);
		String[] numeros = ip.split("\\.");
		int primerNum = Integer.parseInt(numeros[0]);
		int ultimoNum = Integer.parseInt(numeros[3]);
		assertTrue(primerNum != 0);
		assertTrue(ultimoNum != 0);
	}

}
