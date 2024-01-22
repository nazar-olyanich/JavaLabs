import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountAlphaNumericWords {
    /**
     * Підраховує кількість комбінацій літер та цифр у реченні.
     *
     * @param sentence рядок, що містить слова, числа, та комбінації літер та цифр.
     * @return кількість комбінацій літер та цифр у реченні.
     */
    public int countAlphaNumericWords(String sentence) {
        // Регулярний вираз для пошуку комбінацій літер та цифр
        Pattern p = Pattern.compile("(?<!\\S)[a-zA-Z]+\\d+\\w*(?!\\S)|(?<!\\S)\\d+[a-zA-Z]+\\w*(?!\\S)");
        Matcher m = p.matcher(sentence);

        int count = 0;
        // Підраховуємо кількість збігів
        while (m.find()) {
            count++;
        }

        return count;
    }
}
