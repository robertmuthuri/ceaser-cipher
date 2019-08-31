public class Decoding {
    private String plainText;
    private int key;
    private String cipheredText;

    public  String decryptText(String inputText, int shiftKey) {
        plainText = inputText;
        cipheredText = "";
        key = shiftKey;
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            if(Character.isLetter(c)) {
                if(Character.isLowerCase(c)) {
                    char shiftC = (char)( c - key);
                    if(shiftC < 'a') {
                        cipheredText += (char)(shiftC + (26 - shiftC));
                    } else {
                        cipheredText += shiftC;
                    }
                } else if (Character.isUpperCase(c)) {
                    char shiftC = (char)( c - key);
                    if(shiftC < 'A') {
                        cipheredText += (char)(shiftC + (26 - shiftC));
                    } else {
                        cipheredText += shiftC;
                    }
                }

            } else {
                cipheredText += c;
            }
        }
        return cipheredText;
    }
}
