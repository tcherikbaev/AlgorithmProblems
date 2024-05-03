public class ReverseString {

    public static void main (String []  args)
    {
        //151. Reverse Words in a String

        String word="a good   example for";
        String reverse= ReverseString.reverseWords(word);
        System.out.println("Problem #151 'Reverse Words in a Strings Java Code' : ");
        System.out.println(reverse);
    }
    public static String reverseWords(String s) {
        // Split the input string into words
        String[] words = s.trim().split("\\s+");

        // Reverse the array of words
        reverseArray(words);

        // Join the words back together into a single string
        return String.join(" ", words);
    }

    private static void reverseArray(String[] str) {
        int start = 0;
        int end = str.length - 1;
        while (start < end) {
            String temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}

