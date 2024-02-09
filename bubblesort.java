import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bubblesort {

    public static int[] createRandomArray(int arrayLength) {
        Random randArray = new Random();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randArray.nextInt(101);
        }
        return arr;
    }

    public static void writeArrayToFile(int[] array, String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (int i = 0; i < array.length; i++) {
                writer.write(array[i] + "\n");
            }
            writer.close();
            System.out.println("Array written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] readFileToArray(String filename) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                arrayList.add(number);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int newArray[] = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            newArray[i] = arrayList.get(i);
        }
        return newArray;
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to generate a random array and sort it");
        System.out.println("Enter 2 to read an array from a file, sort it, and store the sorted array in another file");
        int choice = scanner.nextInt();

        if (choice == 1) {
            int[] randomArray = createRandomArray(100);
            bubbleSort(randomArray);
            writeArrayToFile(randomArray, "sorted_random_array.txt");
        } else if (choice == 2) {
            System.out.println("Enter the filename to read:");
            String filename = scanner.next();
            int[] array = readFileToArray(filename);
            bubbleSort(array);
            System.out.println("Enter the filename to write sorted array:");
            String outputFilename = scanner.next();
            writeArrayToFile(array, outputFilename);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}