public class Encoding {
    private String plainText;
    private static int key;
    private String cipheredText;


    public Encoding(String plainText, int key){
        this.plainText = plainText;
        this.key = key;
    }

    public  String encryptText() {

        cipheredText = "";
        if(key > 26 ) {
            key = key % 26;
        } else if (key < 0) {
            key = (key % 26) + 26;
        }
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            if(Character.isLetter(c)) {
                if(Character.isLowerCase(c)) {
                    char shiftC = (char)( c + key);
                    if(shiftC > 'z') {
                        cipheredText += (char)(c - (26 - key));
                    } else {
                        cipheredText += shiftC;
                    }
                } else if (Character.isUpperCase(c)) {
                    char shiftC = (char)( c + key);
                    if(shiftC > 'Z') {
                        cipheredText += (char)(c - (26 - key));
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

    public String getPlainText() {
        return plainText;
    }

    public int getKey() {
        return key;
    }
//
    public int setKey(int key) {
        this.key = key;
        return key;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public String getCipheredText() {
        return cipheredText;
    }
}
