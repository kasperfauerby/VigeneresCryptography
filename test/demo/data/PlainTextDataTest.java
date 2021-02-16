package demo.data;

import demo.data.PlainTextData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlainTextDataTest {
    private PlainTextData plainTextData;

    @BeforeEach
    public void start() {
        this.plainTextData = new PlainTextData();
    }

    @Test
    public void read_success() {
        assertTrue(plainTextData.setUri("alice.txt"));
        String data = plainTextData.read();
        assertNotNull(data);
    }

    @Test
    public void read_failure() {
        assertFalse(plainTextData.setUri("mock.txt"));
        String data = plainTextData.read();
        assertNull(data);
    }
}