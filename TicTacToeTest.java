
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {

    @Test
    public void testOWin() {
        TicTacToe t = new TicTacToe();
        t.set(0,0,'O');
        t.set(0,1,'O');
        t.set(0,2,'O');
        assertEquals('O', t.evaluate());
    }

    @Test
    public void testXWin() {
        TicTacToe t = new TicTacToe();
        t.set(0,0,'X');
        t.set(1,1,'X');
        t.set(2,2,'X');
        assertEquals('X', t.evaluate());
    }

    @Test
    public void testDraw() {
        TicTacToe t = new TicTacToe();
        t.set(0,0,'O'); t.set(0,1,'O'); t.set(0,2,'X');
        t.set(1,0,'X'); t.set(1,1,'X'); t.set(1,2,'O');
        t.set(2,0,'O'); t.set(2,1,'X'); t.set(2,2,'O');
        assertEquals('D', t.evaluate());
    }

    @Test
    public void testContinue() {
        TicTacToe t = new TicTacToe();
        t.set(0,0,'O');
        assertEquals('C', t.evaluate());
    }

    @Test
    public void testInvalidMove() {
        TicTacToe t = new TicTacToe();
        t.set(0,0,'O');
        assertFalse(t.set(0,0,'X'));
    }
}
