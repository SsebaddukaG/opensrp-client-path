package samples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import io.ona.kujaku.BuildConfig;
import shared.VaccinatorApplicationTestVersion;

/**
 * Created by Ephraim Kigamba - ekigamba@ona.io on 08/01/2018.
 */
@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, application = VaccinatorApplicationTestVersion.class)
@PowerMockIgnore({"org.mockito.*", "org.robolectric.*", "android.*"})
public class SamplePowerMockTest {

    @Test
    public void sampleTest() {
        Assert.assertTrue(true);
        Assert.assertEquals(4, 4);
    }
}
