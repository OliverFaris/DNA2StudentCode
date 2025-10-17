/**
 * DNA
 * <p>
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *</p>
 * <p>
 * Completed by: Oliver Faris
 *</p>
 */

public class DNA {
    public static int STRCount(String sequence, String STR) {
        int index = 0;
        int longestSTR = 0;
        int currentSTR = 0;
        int sequenceLength = sequence.length();

        // Repeat until there is still an STR in sequence
        while (index != -1) {
            index = sequence.indexOf(STR);
            // Str repeats if index is 0
            if (index == 0 && sequence.length() != sequenceLength) {
                currentSTR += 1;
                if (currentSTR > longestSTR)
                    longestSTR = currentSTR;
            }

            else
                currentSTR = 0;
            // Shorten sequence
            sequence = sequence.substring(index + STR.length());
        }
        return longestSTR + 1;
    }
}
