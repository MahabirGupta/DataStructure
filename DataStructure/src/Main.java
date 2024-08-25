import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(4);
        array.add(3);
        array.add(2);

        System.out.println(array); //orginal array [1, 4, 3, 2]

        reverseArray(array);
    }

    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> reverseArray = new ArrayList<>();
        for (int i = a.size()-1; i>= 0; i--){

            reverseArray.add(a.get(i));
//            reverseArray.add(i); //will print [3, 2, 1, 0] instead of [2, 3, 4, 1]

        }
        System.out.println(reverseArray);
        return reverseArray;


    }
}
