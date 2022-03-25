import java.util.Random;

public class GeneradorIp {
	Random random = new Random();

	public int generarNumero(int min, int max) {
		return random.nextInt(max - min + 1) + min;
	}

	public String generarIp() {
		StringBuilder sb = new StringBuilder();

		sb.append(generarNumero(1, 254));
		sb.append(".");
		sb.append(generarNumero(0, 254));
		sb.append(".");
		sb.append(generarNumero(0, 254));
		sb.append(".");
		sb.append(generarNumero(1, 254));

		return sb.toString();
	}
}
