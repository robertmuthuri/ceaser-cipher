import org.junit.*;
import static org.junit.Assert.*;

public class EncodingTest {
    @Test
    public void encryptText_receiveInputText_true() {
        Encoding input = new Encoding();
        String expected = input.getPlainText();
        assertEquals(true, expected instanceof String);
    }

    @Test
    public void encryptText_receiveCipherKey_int() {
        Encoding input = new Encoding();
        Integer expected = input.getKey();
        assertEquals(true, expected instanceof Integer);
    }

    @Test
    public void encryptText_checkKeyIsWithinAlphabet_int() {
        Encoding input = new Encoding();
        int expected = input.setKey(-20);
        assertEquals(expected,input.getKey());
    }

    @Test
    public void encryptText_checkCypherTextInitialized_String() {
        Encoding input = new Encoding();
        String expected = input.getCipheredText();
        assertEquals(expected, input.getCipheredText());
    }
}