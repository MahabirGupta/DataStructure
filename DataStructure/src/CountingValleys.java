public class CountingValleys {
    public static void main(String[] args) {

        int steps = 8;
        String path ="DDUUUUDD";
        int valleys = countingValleys(steps,path);
        System.out.println("Number of valleys traversed: " + valleys);
        steps = 8;
        String path1 ="UDDDUDUU";
        valleys = countingValleys(steps,path1);
        System.out.println("Number of valleys traversed: " + valleys);


    }
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int seaLevel = 0;
        int count = 0;
        int valleys = 0;
      char[] direction = path.toCharArray();
        for (int i = 0; i <steps ; i++) {
            if (direction[i] == 'U'){
                seaLevel = seaLevel + 1;
            } else if (direction[i] == 'D') {

                seaLevel = seaLevel -1;

            }
//            if (seaLevel == 0){
//                count++;
//            }
            // Check if we just came up from a valley
            if (seaLevel == 0 && path.charAt(i) == 'U') {
                valleys++;
            }

        }
        return valleys;

    }
}
