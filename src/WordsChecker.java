import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {

    protected Set<String> words;

    public WordsChecker(String text) {
        this.words = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWords(String word) {
        return words.contains(word);
    }

}
