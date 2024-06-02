
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MultTest {

    Main main = new Main();

    @Test
    void MultTest1(){
        int result = main._mult("data1.txt");

        Assertions.assertEquals(120, result);

    }

    @Test
    void MultTestTime1() {

        double startTime = System.nanoTime();

        int result = main._mult("data1.txt");

        double endTime = System.nanoTime();
        double timeSpend = (endTime - startTime) / Math.pow(10, 6);

        System.out.println("Time for MaxTest1: " + timeSpend + " ms");

        Assertions.assertTrue(timeSpend < 20);

    }

    @Test
    void MultTest2(){
        int result = main._mult("dataMulti.txt");

        Assertions.assertEquals(19200, result);
    }

    @Test
    void MultTestTime2() {

        double startTime = System.nanoTime();

        int result = main._mult("dataMulti.txt");

        double endTime = System.nanoTime();
        double timeSpend = (endTime - startTime) / Math.pow(10, 6);

        System.out.println("Time for MaxTest1: " + timeSpend + " ms");

        Assertions.assertTrue(timeSpend < 288);

    }

    @Test
    void MultTest3(){
        int result = main._mult("data3.txt");

        Assertions.assertEquals(0, result);
    }

    @Test
    void MultTestTime3() {

        double startTime = System.nanoTime();

        int result = main._mult("data3.txt");

        double endTime = System.nanoTime();
        double timeSpend = (endTime - startTime) / Math.pow(10, 6);

        System.out.println("Time for MaxTest1: " + timeSpend + " ms");

        Assertions.assertTrue(timeSpend < 1000000000);

    }

}
