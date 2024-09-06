public class SmallestPositiveInteger {

    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        int num=solution(A);
        System.out.println("Smallest Positive Integer = " + num);
        int[] B = {1, 2,3};
        num=solution(B);
        System.out.println("Smallest Positive Integer = " + num);
        int[] C = {-1,-3};
        num=solution(C);
        System.out.println("Smallest Positive Integer = " + num);
    }


        public static int solution(int[] A) {
            int N = A.length;
            // Create a boolean array to mark the presence of integers
            boolean[] present = new boolean[N + 1]; // Use N+1 for 1-based indexing

            // Step 1: Mark the presence of integers in the range [1..N]
            for (int i = 0; i < N; i++) {
                if (A[i] > 0 && A[i] <= N) {
                    present[A[i]] = true;
                }
            }

            // Step 2: Find the first integer that is not marked
            for (int i = 1; i <= N; i++) {
                if (!present[i]) {
                    return i; // The first missing positive integer
                }
            }

            // If all integers from 1 to N are present, the answer is N+1
            return N + 1;
        }
    }


