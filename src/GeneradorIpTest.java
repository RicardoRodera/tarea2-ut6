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
			assertTrue(numero >= 254);
		}

	}

}
