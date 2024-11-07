import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;
public class AESEncryption implements EncryptionStrategy {
    private static final String algorithm ="AES";
    private final SecretKey secretKey;
    public AESEncryption() throws Exception  {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(algorithm);
        keyGenerator.init(128);
        this.secretKey = keyGenerator.generateKey();
    }
    @Override
    public String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedData = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedData);
    }
    @Override
    public String decrypt (String encrypteData) throws Exception{
        Cipher cipher=Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE,secretKey);
        byte[] decryptedData=cipher.doFinal(Base64.getDecoder().decode(encrypteData));
        return new String(decryptedData);

    }



}
