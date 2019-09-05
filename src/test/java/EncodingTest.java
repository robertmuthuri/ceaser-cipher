import org.junit.*;
import static org.junit.Assert.*;

public class EncodingTest {
    public Encoding  setNewEncoding(){
        return new Encoding("plain text", 2);
    }
    @Test
    public void encryptText_receiveInputText_true() {
        setNewEncoding();
        String expected = setNewEncoding().getPlainText();
        assertEquals(true, expected instanceof String);
    }

    @Test
    public void encryptText_receiveCipherKey_int() {
        setNewEncoding();
        Integer expected = setNewEncoding().getKey();
        assertEquals(true, expected instanceof Integer);
    }

    @Test
    public void encryptText_checkKeyIsWithinAlphabet_int() {
        Encoding testEncoding = new Encoding("Attack at dawn", 34);
        int expected = testEncoding.setKey(-20);
        assertEquals(expected, testEncoding.getKey());
    }
    @Test
    public void encryptText_checkCypherTextInitialized_String() {
        setNewEncoding();
        String expected = setNewEncoding().getCipheredText();
        assertEquals(expected, setNewEncoding().getCipheredText());
    }
    @Test
    public void encryptText_encryptPlainTextToCipherText_String() {
        setNewEncoding();
        String expectedInput = setNewEncoding().getPlainText();
        String expectedOutput = setNewEncoding().getCipheredText();
    }
    @Test
    public void encrypt_encryptReceivedInputText_true() {
        Encoding testEncoding = new Encoding("Attack at dawn", 34);
        assertEquals("Ibbiks ib liev", testEncoding.encryptText());
    }
}