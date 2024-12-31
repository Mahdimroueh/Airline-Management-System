/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mahdi
 */
import javax.crypto.Cipher;
import java.util.Base64;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EncriptionClass {

    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding"; //Transformation Mode
    private static final String FINAL_KEY = "0123456789abcdef"; // 128-bit key (16 bytes)
    private final SecretKeySpec secretKey;
    private final IvParameterSpec ivParameterSpec;

    public EncriptionClass() {
        // Ensure the key is exactly 16 bytes (128 bits)
        byte[] keyBytes = new byte[16];
        byte[] originalKeyBytes = FINAL_KEY.getBytes();
        System.arraycopy(originalKeyBytes, 0, keyBytes, 0, Math.min(originalKeyBytes.length, keyBytes.length));// COPY originalKeyBytes to keyBytes
        this.secretKey = new SecretKeySpec(keyBytes, ALGORITHM);
        this.ivParameterSpec = new IvParameterSpec(new byte[16]); // All zero IV
    }

    public String encrypt(String plaintext) {
        try {
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
            byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {

        }
        return null;
    }

    public String decrypt(String encryptedText) {
        try {
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
            return new String(decryptedBytes);
        } catch (Exception e) {

        }
        return null;
    }
    public static void main(String[] args) {
//         byte[] originalKeyBytes = FINAL_KEY.getBytes();
//         for(int i=0;i<originalKeyBytes.length ; i++){
//               System.out.print(originalKeyBytes[i] + " ");
//         }
//         new EncriptionClass();
    }
  
}
