package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExsampleTest {

    @Test
    void exsampletest0() {

        Assertions.assertFalse(2 >= 9);
    }

    @Test
    void exsampletest1() {

        Assertions.assertFalse(3 >= 9);
    }
}
