import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ClassifyTest {

    @Test
    public void between() throws Exception {
        assertEquals("lowercase consonant", Classify.classify('s'));
        assertEquals("uppercase consonant", Classify.classify('T'));
        assertEquals("lowercase vowel", Classify.classify('a'));
        assertEquals("uppercase vowel", Classify.classify('U'));
        assertEquals("empty", Classify.classify('8'));
        assertEquals("empty", Classify.classify('<'));

    }
}
