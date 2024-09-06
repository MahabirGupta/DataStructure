public class RepeatedString {

    public static void main(String[] args) {
        String s = "abcac";
        System.out.println(s);
        long n = 10;
        long num = repeatedString(s, n);
        System.out.println("Number of 'a' = " + num);
        s = "aba";
        System.out.println(s);
        n = 10;
        num = repeatedString(s, n);
        System.out.println("Number of 'a' = " + num);
        s = "a";
        System.out.println(s);
        n = 1000000000;
        num = repeatedString(s, n);
        System.out.println("Number of 'a' = " + num);
    }

    public static long repeatedString(String s, long n) {
        // Step 1: Count the number of 'a' in the original string
        long countOfAInString = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countOfAInString++;
            }
        }
        System.out.println("Number of 'a' for original string = " + countOfAInString);
        // Step 2: Calculate the number of full repetitions of s within n characters
        long fullRepetitions = n / s.length();
        System.out.println("The number of full repetitions of s within n characters = " + fullRepetitions);

        // Step 3: Calculate the total count of 'a' in the full repetitions
        long totalAsInFullRepetitions = fullRepetitions * countOfAInString;
        System.out.println("The total count of 'a' in the full repetitions = " + totalAsInFullRepetitions);

        // Step 4: Calculate the remainder of characters after full repetitions
        long remainder = n % s.length();
        System.out.println("The remainder of characters after full repetitions = " + remainder);

        // Step 5: Calculate the count of 'a' in the remaining part of the string
        long countOfAInRemainder = 0;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                countOfAInRemainder++;
            }
        }
        System.out.println("The count of 'a' in the remaining part of the string = " + countOfAInRemainder);
        // Step 6: Sum the counts from full repetitions and remainder
        return totalAsInFullRepetitions + countOfAInRemainder;
    }
}
