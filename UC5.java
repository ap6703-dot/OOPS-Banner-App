/**
 * UC5 - Render OOPS as Banner using Inline Array Initialization
 * 
 * This version combines array declaration and initialization
 * using String.join() in a single statement.
 */

public class UC5 {

    public static void main(String[] args) {

        // Inline declaration + initialization
        String[] lines = {
            String.join("   ", " *** ", " *** ", " ***** ", " ***** "),
            String.join("   ", "*   *", "*   *", "*     ", "*     "),
            String.join("   ", "*   *", "*   *", "*     ", "*     "),
            String.join("   ", "*   *", "*   *", " ***** ", " ***** "),
            String.join("   ", "*   *", "*   *", "     *", "     *"),
            String.join("   ", "*   *", "*   *", "     *", "     *"),
            String.join("   ", " *** ", " *** ", " ***** ", " ***** ")
        };

        // Enhanced for-loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}