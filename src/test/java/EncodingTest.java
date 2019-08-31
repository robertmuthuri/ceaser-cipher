import org.junit.*;
import static org.junit.Assert.*;

public class EncodingTest {
    @Test
    public void encryptText_receiveInputText_true() {
        Encoding input = new Encoding();
        String expected = input.getInputText();
        assertEquals(true, expected instanceof String);
    }

    @Test
    public void encryptText_receiveCipherKey_int() {
        Encoding input = new Encoding();
        Integer expected = input.getKey();
        assertEquals(true, expected instanceof Integer);
    }

    @Test
    public void encryptText_checkKeyIsWithinAlphabet_Integer() {
        Encoding input = new Encoding();
        int expected = input.setKey(150);
        assertEquals(expected,input.getKey());
    }
}