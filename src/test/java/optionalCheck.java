import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertThat;


public class optionalCheck {

    Main main = new Main();

    @Test
    public void testParser1() {

        double startTime = System.nanoTime();

        ArrayList<Integer> result = main.parser("1111 1234 111 1 0 -1 -1031 -1");

        double endTime = System.nanoTime();
        System.out.println("Time for SumTest2: " + (endTime - startTime) / Math.pow(10, 6) + " ms");

        ArrayList<Integer> look = new ArrayList<>(Arrays.asList(1111, 1234, 111, 1, 0, -1, -1031, -1));

        Assertions.assertEquals(look, result);

    }

    @Test
    public void testParser2() {

        double startTime = System.nanoTime();

        ArrayList<Integer> result = main.parser("-121 1921 210 201 0 -1921 01");

        double endTime = System.nanoTime();
        System.out.println("Time for SumTest2: " + (endTime - startTime) / Math.pow(10, 6) + " ms");

        ArrayList<Integer> look = new ArrayList<>(Arrays.asList(-121, 1921, 210, 201, 0, -1921, 1));

        Assertions.assertEquals(look, result);

    }

    @Test
    public void testParser3() {

        double startTime = System.nanoTime();

        ArrayList<Integer> result = main.parser("-");

        double endTime = System.nanoTime();
        System.out.println("Time for SumTest2: " + (endTime - startTime) / Math.pow(10, 6) + " ms");

        ArrayList<Integer> look = new ArrayList<>(Arrays.asList(-1));

        Assertions.assertEquals(look, result);

    }

}
