package samples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * Created by Ephraim Kigamba - ekigamba@ona.io on 08/01/2018.
 */

@RunWith(RobolectricTestRunner.class)
public class SampleRobolectricTest {

    @Test
    public void sampleTest() {
        Assert.assertTrue(true);
        Assert.assertEquals(4, 4);
    }
}
