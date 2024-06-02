
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class SumTest {

    Main main = new Main();

    @Test
    void SumTest1(){
        long result = main._sum("data1.txt");

        Assertions.assertEquals(15, result);
    }

    @Test
    void SumTestTime1() {

        double startTime = System.nanoTime();

        long result = main._sum("data1.txt");

        double endTime = System.nanoTime();
        double timeSpend = (endTime - startTime) / Math.pow(10, 6);

        System.out.println("Time for MaxTest1: " + timeSpend + " ms");

        Assertions.assertTrue(timeSpend < 20);

    }


    @Test
    void SumTest2(){
        long result = main._sum("data2.txt");

        Assertions.assertEquals(26185619, result);
    }

    @Test
    void SumTestTime2() {

        double startTime = System.nanoTime();

        long result = main._sum("data2.txt");

        double endTime = System.nanoTime();
        double timeSpend = (endTime - startTime) / Math.pow(10, 6);

        System.out.println("Time for MaxTest1: " + timeSpend + " ms");

        Assertions.assertTrue(timeSpend < 400);

    }

    @Test
    void SumTest3(){
        long result = main._sum("data3.txt");

        Assertions.assertEquals(503537967, result);
    }

    @Test
    void SumTestTime3() {

        double startTime = System.nanoTime();

        long result = main._sum("data3.txt");

        double endTime = System.nanoTime();
        double timeSpend = (endTime - startTime) / Math.pow(10, 6);

        System.out.println("Time for MaxTest1: " + timeSpend + " ms");

        Assertions.assertTrue(timeSpend < 1000000000);

    }

}
