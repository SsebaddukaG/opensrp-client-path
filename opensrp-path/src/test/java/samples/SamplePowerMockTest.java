package samples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by Ephraim Kigamba - ekigamba@ona.io on 08/01/2018.
 */
@RunWith(PowerMockRunner.class)
public class SamplePowerMockTest {

    @Test
    public void sampleTest() {
        Assert.assertTrue(true);
        Assert.assertEquals(4, 4);
    }
}
