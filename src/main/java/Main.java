import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

import java.util.function.Predicate;


public class Main {



    public static void main(String [] args) {

        double startTime = System.nanoTime();

        int resultMin1 = _min("C:\\Users\\realg\\Desktop\\POP\\Tech_Task\\Solution\\data1.txt");

        timeScale("_min", "C:\\Users\\realg\\Desktop\\POP\\Tech_Task\\Solution\\src\\data1.txt");

    }

    // Метод, который будет выводить время работы метода

    public static void timeScale(String nameOfFunction, String pathToFile) {

        if (nameOfFunction == "_min") {

            double startTime = System.nanoTime();

            int resultMin1 = _min(pathToFile);

            double endTime = System.nanoTime();
            double timeSpend = (endTime - startTime) / Math.pow(10, 6);

            System.out.println("Time : " + timeSpend + " ms");
        }

        else if (nameOfFunction == "_max") {
            double startTime = System.nanoTime();

            int resultMin1 = _max(pathToFile);

            double endTime = System.nanoTime();
            double timeSpend = (endTime - startTime) / Math.pow(10, 6);

            System.out.println("Time : " + timeSpend + " ms");
        }

        else if (nameOfFunction == "_mult") {
            double startTime = System.nanoTime();

            int resultMin1 = _mult(pathToFile);

            double endTime = System.nanoTime();
            double timeSpend = (endTime - startTime) / Math.pow(10, 6);

            System.out.println("Time : " + timeSpend + " ms");
        }

        else if (nameOfFunction == "_sum") {
            double startTime = System.nanoTime();

            int resultSum = _sum(pathToFile);

            double endTime = System.nanoTime();
            double timeSpend = (endTime - startTime) / Math.pow(10, 6);

            System.out.println("Time : " + timeSpend + " ms");
        }

        else {
            System.out.println("ERROR with name of function to SCALE");
        }

    }

    public static ArrayList<Integer> parser(String line) {

        try {
            ArrayList<Integer> result = new ArrayList<>();

            String rep = "";

            for (int index_of_line = 0; index_of_line < line.length(); index_of_line++) {
                if (line.charAt(index_of_line) == ' ') {
                    result.add(Integer.valueOf(rep));
                    rep = "";
                } else {
                    rep += line.charAt(index_of_line);
                }
            }

            result.add(Integer.valueOf(rep));

            return result;
        }

        catch (Exception e) {
            System.out.println(e);
        }

        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(-1));
        return result;
    }

    public static int _min(String pathToFile){
//        int minNumber = (int) Math.pow(10, 9);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
            String allNumbersFirst = reader.readLine();

            ArrayList <Integer> arrayWithNumbers = parser(allNumbersFirst);

            int minNumber = 1000000000;
            int sizeOfArray = arrayWithNumbers.size();

            for (int index = 0; index < sizeOfArray; index++) {
                minNumber = Math.min(minNumber, arrayWithNumbers.get(index));
            }

            return minNumber;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return -1;

    }

    //
    public static int _max(String pathToFile) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
            String allNumbersFirst = reader.readLine();

            ArrayList <Integer> arrayWithNumbers = parser(allNumbersFirst);

            int minNumber = -1000000000;
            int sizeOfArray = arrayWithNumbers.size();

            for (int index = 0; index < sizeOfArray; index++) {
                minNumber = Math.max(minNumber, arrayWithNumbers.get(index));
            }

            return minNumber;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return -1;
    }
    //
    public static int _sum(String pathToFile) {


        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
            String allNumbersFirst = reader.readLine();

            ArrayList <Integer> arrayWithNumbers = parser(allNumbersFirst);
            int sum = 0;
            int sizeOfArray = arrayWithNumbers.size();

            for (int index = 0; index < sizeOfArray; index++) {
                sum += arrayWithNumbers.get(index);
            }

            return sum;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return -1;
    }

    public static int _mult(String pathToFile) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
            String allNumbersFirst = reader.readLine();

            ArrayList<Integer> arrayWithNumbers = parser(allNumbersFirst);
            int sum = 1;
            int sizeOfArray = arrayWithNumbers.size();

            for (int index = 0; index < sizeOfArray; index++) {
                sum *= arrayWithNumbers.get(index);
            }

            return sum;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return -1;

    }

}