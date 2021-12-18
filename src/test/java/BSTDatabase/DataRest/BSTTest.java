package BSTDatabase.DataRest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BSTTest {
    @Test
    void testConstructor() {
        BST actualBst = new BST();
        actualBst.setId(123L);
        actualBst.setInput("Input");
        assertEquals(123L, actualBst.getId());
        assertEquals("Input", actualBst.getInput());
    }
}

