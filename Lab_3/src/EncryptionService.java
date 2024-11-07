import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class EncryptionService {
    private EncryptionStrategy strategy;

        public void setEncryptionStrategy(EncryptionStrategy strategy) {
            this.strategy = strategy;
        }

        public void encryptFile(String inputFilePath, String outputFilePath) throws Exception {
            String data = readFile(inputFilePath);
            String encryptedData = strategy.encrypt(data);
            writeFile(outputFilePath, encryptedData);
        }

        public void decryptFile(String inputFilePath, String outputFilePath) throws Exception {
            String encryptedData = readFile(inputFilePath);
            String decryptedData = strategy.decrypt(encryptedData);
            writeFile(outputFilePath, decryptedData);
        }

        private String readFile(String filePath) throws IOException {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        }

        private void writeFile(String filePath, String data) throws IOException {
            Files.write(Paths.get(filePath), data.getBytes());
        }
    }


