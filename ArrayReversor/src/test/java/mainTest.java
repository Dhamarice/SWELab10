import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class mainTest {

    private main mymain = mock(main.class);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseArrayTest() {

        int[][] input = {{1,3}, {0}, {4,5,9}};
        when(mymain.flattenArray(input)).thenReturn(new int[]{1,3,0,4,5,9});
        int[] actual = main.reverseArray(input);
        int[] expected = {9,5,4,0,3,1};
        assertThat(actual,is(expected));
    }
}