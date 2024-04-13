public class ReverseString {
    public static String reverseWords(String s) {
        // Split the input string into words
        String[] words = s.trim().split("\\s+");

        // Reverse the array of words
        reverseArray(words);

        // Join the words back together into a single string
        return String.join(" ", words);
    }

    private static void reverseArray(String[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

