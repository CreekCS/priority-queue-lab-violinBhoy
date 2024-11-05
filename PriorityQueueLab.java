// import statements
import java.util.Scanner;
import java.io.File;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.io.FileNotFoundException;

public class PriorityQueueLab {
    public static void main(String args[]) {
        try {
            File file = new File("RandIntegers.txt");
            Scanner fileScanner = new Scanner(file);
            PriorityQueue<Integer> ints = new PriorityQueue<Integer>();
            while (fileScanner.hasNextLine()){
                ints.add(Integer.parseInt(fileScanner.nextLine()));
            }
            int length = ints.size();
            for (int i = 0; i < length; i++) {
                System.out.println(ints.remove());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

