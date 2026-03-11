/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case implements a CharacterPatternMap class to store
 * character-to-pattern mappings and display "OOPS" as ASCII banner.
 *
 * @author Developer
 * @version 7.0
 */

public class UC7 {

    /**
     * Inner Static Class to map a character with its ASCII pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character character to map
         * @param pattern ASCII pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates CharacterPatternMap array
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };

        String[] SPACE = {
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        };

        maps[0] = new CharacterPatternMap('O', O);
        maps[1] = new CharacterPatternMap('P', P);
        maps[2] = new CharacterPatternMap('S', S);
        maps[3] = new CharacterPatternMap(' ', SPACE);

        return maps;
    }

    /**
     * Returns ASCII pattern for a given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {

        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return maps[3].getPattern(); // return space pattern if not found
    }

    /**
     * Prints banner message
     */
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, maps);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}