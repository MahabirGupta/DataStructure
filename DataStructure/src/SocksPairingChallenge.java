import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class SocksPairingChallenge {

    public static void main(String[] args) {
        int n = 7;
        List<Integer> ar = new ArrayList<>();
        ar.add(1); ar.add(2); ar.add(1); ar.add(2); ar.add(1); ar.add(3); ar.add(2);
        System.out.println(ar);
        int pairs = sockMerchant(n, ar);
        System.out.println("There are " + pairs + " pairs");
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        HashSet<Integer> unmatchedSocks = new HashSet<>();
        System.out.println(unmatchedSocks);
        int pairs = 0;

        // Iterate through the list of socks
        for (int sock : ar) {
            // If the sock is already in the set, it means we found a pair
            if (unmatchedSocks.contains(sock)) {
                pairs++;
                unmatchedSocks.remove(sock); // Remove the paired sock
                System.out.println(unmatchedSocks);
            } else {
                // If not, add the sock to the set for later matching
                unmatchedSocks.add(sock);
                System.out.println(unmatchedSocks);
            }
        }

        return pairs;
    }
}
