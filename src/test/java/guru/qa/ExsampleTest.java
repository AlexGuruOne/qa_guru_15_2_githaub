package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExsampleTest {

    @Test
    void exsampletest0() {
        Assertions.assertTrue(new Random().nextInt() > 1);
    }

    @Test
    void exsampletest1() {
        Assertions.assertTrue(new Random().nextInt() > 2);
    }
}
