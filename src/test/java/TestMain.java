import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    public TestMain() {
        Locale.setDefault(new Locale("en", "US"));
    }

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainFirst() {
        String data = "12";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        int expected = 14;
        int actual = Integer.parseInt(outContent.toString().replaceAll("[\\r\\n]", ""));

        assertEquals(expected, actual);
    }

    @Test
    public void testMainSecond() {
        String data = "73";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        int expected = 74;
        int actual = Integer.parseInt(outContent.toString().replaceAll("[\\r\\n]", ""));

        assertEquals(expected, actual);
    }

    @Test
    public void testMainThird() {
        String data = "192";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        int expected = 194;
        int actual = Integer.parseInt(outContent.toString().replaceAll("[\\r\\n]", ""));

        assertEquals(expected, actual);
    }

    @Test
    public void testMainForth() {
        String data = "6285";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        int expected = 6286;
        int actual = Integer.parseInt(outContent.toString().replaceAll("[\\r\\n]", ""));

        assertEquals(expected, actual);
    }

    @Test
    public void testMainFifth() {
        String data = "9278";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        int expected = 9280;
        int actual = Integer.parseInt(outContent.toString().replaceAll("[\\r\\n]", ""));

        assertEquals(expected, actual);
    }

}