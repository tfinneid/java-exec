package no.fcon;

import org.junit.*;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    public void testName() {
        assertThat(Main.getName()).isEqualTo("Main");
    }
}
