package readMethods;

import java.util.Base64;

public class DecodeClass {
    public static byte[] decodeBytes(String fileString) {
        Base64.Decoder decoder = Base64.getDecoder();
        return Base64.getDecoder().decode(fileString.getBytes());
    }
}
