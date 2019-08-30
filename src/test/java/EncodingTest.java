import org.junit.*;
import static org.junit.Assert.*;

public class EncodingTest {
    @Test
    public void cipherText_receiveInputText_String() {
        Encoding input = new Encoding();
        String expected = input.inputText;
        assertEquals(expected, input.cipherText(input.getInputText()));

    }
}