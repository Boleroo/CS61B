import java.util.*;
public class DemoCollections {
    public static String cleanString(String s) {
        return s.toLowerCase().replaceAll("[^a-z]", "");
    }
    /** Gets a list of all words in the file. */
    public static List<String> getWords(String inputFilename) {
        List<String> words = new ArrayList<>();
        In in = new In(inputFilename);
        while (!in.isEmpty()) {
            String nextWord = cleanString(in.readString());
            words.add(nextWord);
        }
        return words;
    }

    /** Returns the count of the number of unique words. */
    public static int countUniqueWords(List<String> words) {
        Set<String> wordSet = new HashSet<>();
        for(String word: words) {
            wordSet.add(word);
        }
        return wordSet.size();
    }

    public static void main(String[] args) {
        String filename = "./libraryOfBabylon";
        List<String> words = getWords(filename);
        System.out.println(words);
        int count = countUniqueWords(words);
        System.out.println(count);
    }
}
