import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExternalResource;
import org.junit.rules.Stopwatch;

class MaxTest {

    Main main = new Main();

    @Test
    void MaxTest1(){

        int result = main._max("data1.txt");

        Assertions.assertEquals(5, result);


    }


    @Test
    void MaxTestTime1() {

        double startTime = System.nanoTime();

        int result = main._max("data1.txt");

        double endTime = System.nanoTime();
        double timeSpend = (endTime - startTime) / Math.pow(10, 6);

        System.out.println("Time for MaxTest1: " + timeSpend + " ms");

        Assertions.assertTrue(timeSpend < 7);

    }

    @Test
    void MaxTest2(){
        int result = main._max("data2.txt");

        Assertions.assertEquals(100000, result);
    }

    @Test
    void MaxTimeTest2() {

        double startTime = System.nanoTime();

        int result = main._max("data2.txt");

        double endTime = System.nanoTime();
        double timeSpend = (endTime - startTime) / Math.pow(10, 6);

        System.out.println("Time for MaxTest2 " + timeSpend + " ms");

        Assertions.assertTrue(timeSpend < 140);
    }

    @Test
    void MaxTest3(){

        int result = main._max("data3.txt");

        Assertions.assertEquals(99999, result);
    }

    @Test
    void MaxTimeTest3() {

        double startTime = System.nanoTime();

        int result = main._max("data3.txt");

        double endTime = System.nanoTime();
        double timeSpend = (endTime - startTime) / Math.pow(10, 6);

        System.out.println("Time for MaxTest2 " + timeSpend + " ms");

        Assertions.assertTrue(timeSpend < 10000000);
    }

}
