import java.util.ArrayList;
import java.util.List;

public class JumpingOnClouds {

    public static void main(String[] args) {

        List<Integer> c = new ArrayList<>();
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        System.out.println(c);
        int minJump = jumpingOnClouds(c);
        System.out.println("The minimum number of jumps required = " + minJump);

        List<Integer> c1 = new ArrayList<>();
        c1.add(0);
        c1.add(0);
        c1.add(1);
        c1.add(0);
        c1.add(0);
        c1.add(1);
        c1.add(0);
        System.out.println(c1);
        minJump = jumpingOnClouds(c1);
        System.out.println("The minimum number of jumps required = " + minJump);

        List<Integer> c2 = new ArrayList<>();
        c2.add(0);
        c2.add(0);
        c2.add(0);
        c2.add(0);
        c2.add(1);
        c2.add(0);
        System.out.println(c2);
        minJump = jumpingOnClouds(c2);
        System.out.println("The minimum number of jumps required = " + minJump);



    }
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jumps = 0;
        int i = 0;

        // Traverse the cloud array
        while (i < c.size() - 1) {
            // Check if we can make a jump of 2 steps
            if (i + 2 < c.size() && c.get(i + 2) == 0) {
                i += 2; // Jump 2 clouds
            } else {
                i += 1; // Jump 1 cloud
            }
            jumps++; // Increment the jump count
        }
        return jumps;
    }
}
