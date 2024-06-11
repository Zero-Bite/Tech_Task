import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

import java.util.function.Predicate;


public class Main {



    public static void main(String [] args) {

        double startTime = System.nanoTime();


        // Почему то стали возникать ошибки при подлючении файлов, поэтому писал локально полный путь
        //timeScale("_min", "C:\\Users\\realg\\Desktop\\POP\\Tech_Task\\Solution\\src\\data1.txt");

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

    // Для чтения файоа из файла
    public static ArrayList <Integer> readFile(String pathToFile) {

        try(BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            String allNumbersFirst = reader.readLine();

            ArrayList <Integer> arrayWithNumbers = parser(allNumbersFirst);

            return arrayWithNumbers;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList <Integer> torRet = new ArrayList<Integer>(Arrays.asList(-1));

        return torRet;
    }


    public static ArrayList<Integer> parser(String line) {

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

    public static int _min(String pathToFile){
            ArrayList <Integer> arrayWithNumbers = readFile(pathToFile);

            int minNumber = 1000000000;
            int sizeOfArray = arrayWithNumbers.size();

            for (int index = 0; index < sizeOfArray; index++) {
                minNumber = Math.min(minNumber, arrayWithNumbers.get(index));
            }

            return minNumber;
    }


    //
    public static int _max(String pathToFile) {

        ArrayList <Integer> arrayWithNumbers = readFile(pathToFile);

        int minNumber = -1000000000;
        int sizeOfArray = arrayWithNumbers.size();

        for (int index = 0; index < sizeOfArray; index++) {
            minNumber = Math.max(minNumber, arrayWithNumbers.get(index));
        }

        return minNumber;
    }
    //
    public static int _sum(String pathToFile) {
        ArrayList <Integer> arrayWithNumbers = readFile(pathToFile);

        int sum = 0;
        int sizeOfArray = arrayWithNumbers.size();

        for (int index = 0; index < sizeOfArray; index++) {
            sum += arrayWithNumbers.get(index);
        }

        return sum;
        }

    public static int _mult(String pathToFile) {

        ArrayList <Integer> arrayWithNumbers = readFile(pathToFile);
        int sum = 1;
        int sizeOfArray = arrayWithNumbers.size();

        for (int index = 0; index < sizeOfArray; index++) {
            sum *= arrayWithNumbers.get(index);
        }

        return sum;
    }

}