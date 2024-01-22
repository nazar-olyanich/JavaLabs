public class IntToHexString {
    /**
     * Перетворює значення int у рядок, що представляє собою число у шістнадцятковій системі числення.
     *
     * @param i ціле число, яке потрібно перетворити.
     * @return рядок, що представляє число у шістнадцятковій системі числення.
     */
    public String intToHexString(int i) {
        return Integer.toHexString(i).toUpperCase();
    }
}
