public class Encoding {
    private String plainText = "";
    private int key;
    private String cipheredText;


    public  String encryptText(String inputText, int shiftKey) {
       plainText = inputText;
       key = shiftKey;
        for (int i = 0; i < plainText.length; i++) {
            char c = plainText.charAt(i);
            if(Character.isLetter(c)) {
                if(Character.isLowerCase(c)) {
                    char shiftC = (char)( c + key);
                    if(shiftC > 'z') {
                        cipheredText += (char)(shiftC - (26 - shiftC));
                    } else {
                        cipheredText += shiftC;
                    }
                } else if (Character.isUpperCase(c)) {
                    if(shiftC > 'Z') {
                        cipheredText += (char)(shiftC - (26 - shiftC));
                    } else {
                        cipheredText += shiftC;
                    }
                }

            } else {
                cipheredText += c;
            }
        }

    return null;
    }

    public String getPlainText() {
        return plainText;
    }

    public int getKey() {
        return key;
    }

    public int setKey(int key) {
        if(key > 26 ) {
            key = key % 26;
            this.key = key;
        } else if (key < 0) {
            key = (key % 26) + 26;
            this.key = key;
        }
        return key;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public String getCipheredText() {
        return cipheredText;
    }
}
