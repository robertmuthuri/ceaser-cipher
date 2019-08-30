import org.junit.*;
import static org.junit.Assert.*;

public class EncodingTest {
    @Test
    public void cipherText_receiveInputText_String() {
        Encoding input = new Encoding();
        String expected = input.getInputText();
        assertEquals(expected, input.cipherText(input.getInputText()));
    }

    @Test
    public void cipherText_receiveCipherKey_int() {
        Encoding input = new Encoding();
        int expected = input.key;
        assertEquals(expected, 1);
    }
}