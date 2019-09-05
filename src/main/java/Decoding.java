public class Decoding {
    private int key;
    private String cipheredText;

    public Decoding(String cipheredText, int key){
        this.cipheredText = cipheredText;
        this.key = key;
    }

    public  String decryptText() {
        String plainText = "";
        if(key > 26 ) {
            key = key % 26;
        } else if (key < 0) {
            key = (key % 26) + 26;
        }
        for (int i = 0; i < cipheredText.length(); i++) {
            char c = cipheredText.charAt(i);
            if(Character.isLetter(c)) {
                if(Character.isLowerCase(c)) {
                    char shiftC = (char)( c - key);
                    if(shiftC < 'a') {
                        plainText += (char)(c + (26 - key));
                    } else {
                        plainText += shiftC;
                    }
                } else if (Character.isUpperCase(c)) {
                    char shiftC = (char)( c - key);
                    if(shiftC < 'A') {
                        plainText += (char)(c + (26 - key));
                    } else {
                        plainText += shiftC;
                    }
                }

            } else {
                plainText += c;
            }
        }
        return plainText;
    }

    public String getCipheredText() {
        return cipheredText;
    }
    public int getKey() {
        return key;
    }
}
