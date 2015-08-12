import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {

    @Test
    public void test_forthree_3(){
        NumbersToWords app = new NumbersToWords();
        String word = "three";
        assertEquals(word, app.finalWord("3"));
    }
}
