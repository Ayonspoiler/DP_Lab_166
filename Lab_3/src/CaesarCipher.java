public class CaesarCipher implements EncryptionStrategy{

        private final int shift;

        public CaesarCipher(int shift) {
            this.shift = shift;
        }

        @Override
        public String encrypt(String data) {
            StringBuilder result = new StringBuilder();
            for (char character : data.toCharArray()) {
                if (Character.isUpperCase(character)) {
                    result.append((char) (((int) character + shift - 65) % 26 + 65));
                } else if (Character.isLowerCase(character)) {
                    result.append((char) (((int) character + shift - 97) % 26 + 97));
                } else {
                    result.append(character);
                }
            }
            return result.toString();
        }
        @Override
        public String decrypt(String encryptedData) {
            StringBuilder result = new StringBuilder();
            for (char character : encryptedData.toCharArray()) {
                if (Character.isUpperCase(character)) {
                    result.append((char) (((int) character - shift - 65 + 26) % 26 + 65));
                } else if (Character.isLowerCase(character)) {
                    result.append((char) (((int) character - shift - 97 + 26) % 26 + 97));
                } else {
                    result.append(character);
                }
            }
            return result.toString();
        }
    }


