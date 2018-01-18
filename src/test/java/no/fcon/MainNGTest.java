package no.fcon;

import org.testng.annotations.*;

import static org.assertj.core.api.Assertions.*;

public class MainNGTest {

    @Test
    public void testName() {
        assertThat(Main.getName()).isEqualTo("Main");
    }

}
