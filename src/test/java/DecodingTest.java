import org.junit.*;
import static org.junit.Assert.*;

class DecodingTest {
    public Decoding  setNewDecoding(){
        return new Decoding("ciphered text", 2);
    }
    @Test
    public void decryptText_receiveInputText_true() {
        setNewDecoding();
        String expected = setNewDecoding().getCipheredText();
        assertEquals(true, expected instanceof String);
    }

    @Test
    public void decryptText_receiveCipherKey_int() {
        setNewDecoding();
        Integer expected = setNewDecoding().getKey();
        assertEquals(true, expected instanceof Integer);
    }

    @Test
    public void decryptText_checkKeyIsWithinAlphabet_int() {
        Encoding testEncoding = new Encoding("Attack at dawn", 34);
        int expected = testEncoding.setKey(-20);
        assertEquals(expected, testEncoding.getKey());
    }

    @Test
    public void decryptText_checkCypherTextInitialized_String() {
        setNewDecoding();
        String expected = setNewDecoding().getCipheredText();
        assertEquals(expected, setNewDecoding().getCipheredText());
    }

    @Test
    public void decryptText_encryptPlainTextToCipherText_String() {
        setNewDecoding();
        String expectedInput = setNewDecoding().getCipheredText();
        String expectedOutput = setNewDecoding().getCipheredText();
    }
    @Test
    public void encrypt_encryptReceivedInputText_true() {
        Encoding testEncoding = new Encoding("Attack at dawn", 34);
        assertEquals("Ibbiks ib liev", testEncoding.decryptText());
    }

}