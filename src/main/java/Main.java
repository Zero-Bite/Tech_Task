import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;


public class Main {

    public static void main(String [] args) {
        long multResult = _sum("data3.txt");
        System.out.println(multResult);
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
    public static long _sum(String pathToFile) {


        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
            String allNumbersFirst = reader.readLine();

            ArrayList <Integer> arrayWithNumbers = parser(allNumbersFirst);
            long sum = 0;
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