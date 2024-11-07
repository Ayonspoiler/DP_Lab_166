import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EncryptionService encryptionService = new EncryptionService();

        try {

            System.out.println("Select Encryption Algorithm:");
            System.out.println("1. AES");
            System.out.println("2. DES");
            System.out.println("3. Caesar Cipher");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    encryptionService.setEncryptionStrategy(new AESEncryption());
                    break;
                case 2:
                    encryptionService.setEncryptionStrategy(new DESEncryption());
                    break;
                case 3:
                    System.out.println("Enter shift value for Caesar Cipher:");
                    int shift = scanner.nextInt();
                    encryptionService.setEncryptionStrategy(new CaesarCipher(shift));
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            System.out.println("Enter input file path:");
            String inputFilePath = scanner.nextLine();


            System.out.println("Enter output file path for encrypted data:");
            String encryptedFilePath = scanner.nextLine();

            encryptionService.encryptFile(inputFilePath, encryptedFilePath);
            System.out.println("File encrypted successfully!");

            System.out.println("Enter output file path for decrypted data:");
            String decryptedFilePath = scanner.nextLine();

            encryptionService.decryptFile(encryptedFilePath, decryptedFilePath);
            System.out.println("File decrypted successfully!");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
