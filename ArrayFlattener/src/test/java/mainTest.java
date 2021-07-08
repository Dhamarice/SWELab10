import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class mainTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void flattenArrayTest() {
        int[][] inputn = {{1,3}, {0}, {4,5,9}};
        int[] expected = {1,3,0,4,5,9};
        int[] actual = main.flattenArray(inputn);
        assertThat(actual, is(expected));
    }

    @Test
    public void flattenNullArrayTest() {
        int[][] inputn = null;
        int[] expected = null;
        int[] actual = main.flattenArray(inputn);
        assertThat(actual, is(expected));
    }
}