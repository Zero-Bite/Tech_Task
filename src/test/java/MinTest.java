import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinTest {

    Main main = new Main();

    @Test
    void MinTest1(){
        int result = main._min("data1.txt");

        Assertions.assertEquals(1, result);
    }

    @Test
    void MinTestTime1() {

        double startTime = System.nanoTime();

        int result = main._min("data1.txt");

        double endTime = System.nanoTime();
        double timeSpend = (endTime - startTime) / Math.pow(10, 6);

        System.out.println("Time for MaxTest1: " + timeSpend + " ms");

        Assertions.assertTrue(timeSpend < 7);

    }

    @Test
    void MinTest2(){
        int result = main._min("data2.txt");

        Assertions.assertEquals(-99999, result);
    }

    @Test
    void MinTestTime2() {

        double startTime = System.nanoTime();

        int result = main._min("data2.txt");

        double endTime = System.nanoTime();
        double timeSpend = (endTime - startTime) / Math.pow(10, 6);

        System.out.println("Time for MaxTest1: " + timeSpend + " ms");

        Assertions.assertTrue(timeSpend < 140);

    }

    @Test
    void MinTest3(){
        int result = main._min("data3.txt");

        Assertions.assertEquals(0, result);
    }

    @Test
    void MinTestTime3() {

        double startTime = System.nanoTime();

        int result = main._min("data4.txt");

        double endTime = System.nanoTime();
        double timeSpend = (endTime - startTime) / Math.pow(10, 6);

        System.out.println("Time for MaxTest1: " + timeSpend + " ms");

        Assertions.assertTrue(timeSpend < 100000000);

    }

}
