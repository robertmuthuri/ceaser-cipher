public class Encoding {
    private String plainText = "";
    private int key;
    private String cipheredText;


    public  String encryptText(String inputText, int shiftKey) {
       plainText = inputText;
       key = shiftKey;


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
}
