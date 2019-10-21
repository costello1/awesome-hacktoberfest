package cifrarioVigenere;

public class Vigenere {

	static String cifra(String testo, String chiave) {
		StringBuilder str = new StringBuilder(testo.length());

		for (int i = 0; i < testo.length(); i++) {
			str.append(cifratore(testo.charAt(i), chiave.charAt(i % chiave.length())));
		}
		return str.toString();
	}

	public static char cifratore(int carattere, int chiave) {

		int cifrato = (carattere + chiave) % 26;

		return (char) ('a' + cifrato);


	}
}
