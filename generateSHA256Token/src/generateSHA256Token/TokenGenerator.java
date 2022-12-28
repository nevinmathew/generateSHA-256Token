package generateSHA256Token;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class TokenGenerator {

	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException {
		TokenGenerator.generateToken();
	}

	public static void generateToken() throws NoSuchAlgorithmException, InvalidKeyException {
		final Charset asciiCs = Charset.forName("US-ASCII");
		final Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
		final SecretKeySpec secret_key = new javax.crypto.spec.SecretKeySpec(asciiCs.encode("key").array(),
				"HmacSHA256");
		sha256_HMAC.init(secret_key);
		final byte[] mac_data = sha256_HMAC
				.doFinal(asciiCs.encode("The quick brown fox jumps over the lazy dog").array());
		String result = "";
		for (final byte element : mac_data) {
			result += Integer.toString((element & 0xff) + 0x100, 16).substring(1);
		}
		System.out.println("Result:[" + result + "]");
	}
}
