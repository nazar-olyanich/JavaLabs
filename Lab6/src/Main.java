public class Main {
    public static void main(String[] args) {
        // Демонстрація роботи класу IntToHexString
        IntToHexString converter = new IntToHexString();
        int number = 51966;
        String hexString = converter.intToHexString(number);
        System.out.println("Число " + number + " у шістнадцятковій системі числення: " + hexString);

        // Демонстрація роботи класу CountAlphaNumericWords
        CountAlphaNumericWords counter = new CountAlphaNumericWords();
        String sentence = "The user with the nickname koala757677 this month wrote 3 times more " +
                "comments than the user with the nickname croco181dile920 4 months ago";
        int count = counter.countAlphaNumericWords(sentence);
        System.out.println("Кількість комбінацій літер та цифр у реченні: " + count);
    }
}
