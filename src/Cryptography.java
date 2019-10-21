public class Cryptography
{
    private int rotations = 13;  // used in the second part
    public static final int START_OF_ALPHABET = 65;
    public static final int END_OF_ALPHABET = 90;

    public Cryptography()
    {
        // no need to put anything here for now.
    }

    public int convertToNumbers(char letter)
    {
        int result = (int) letter;
        return result;
    }

    // create a similar method for the ROT13 portion.
    // This method will return a character instead.
    public char applyRotation(char letter) {
        if (letter <= 'M') {
            letter += rotations;
        } else {
            letter -= rotations;
        }
        return letter;
     }
}
