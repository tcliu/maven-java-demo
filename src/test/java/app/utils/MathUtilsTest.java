package app.utils;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Liu on 8/27/2016.
 */
public class MathUtilsTest {

    @Test
    public void sum() {
        assertThat(MathUtils.sum(2,3), is(5));
    }
}
