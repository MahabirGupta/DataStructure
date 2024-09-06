import java.util.ArrayList;
import java.util.List;

public class ArraysLeftRotation {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println("Original array: " + a);
        List<Integer> rotatedArray = rotLeft(a, 2);
        System.out.println("Rotated array: " + rotatedArray);
        System.out.println("Original array: " + a);
        List<Integer> rotatedArray1 = rotLeft(a, 4);
        System.out.println("Rotated array: " + rotatedArray1);
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        int n = a.size();
        d = d % n;  // Handle cases where d > n

        // Create the rotated array using sublist and concatenation
        List<Integer> rotatedArray = new ArrayList<>(a.subList(d, n));
        rotatedArray.addAll(a.subList(0, d));

        return rotatedArray;
    }
}
