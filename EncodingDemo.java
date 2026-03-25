import java.util.*;
public class EncodingDemo {
    public static void main(String[] args) {
        String ori= "Welcome to Javaprogram.com \n good day!";
        Base64.Encoder simpleEncoder= Base64.getEncoder();
        String encodedString = simpleEncoder.encodeToString(ori.getBytes());
        System.out.println("Encoded string: "+ encodedString);
        Base64.Decoder simplDecoder = Base64.getDecoder();
        String decodedString = new String(simplDecoder.decode(encodedString.getBytes()));
        System.out.println("Decoded String: "+ decodedString);

    }
}
