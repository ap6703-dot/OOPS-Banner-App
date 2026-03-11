/*
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them using a for-each loop.
 */

public class UC4 {

    public static void main(String[] args) {

        // Step 1: Create String array of size 7
        String[] lines = new String[7];

        // Step 2: Populate each line using String.join()
        lines[0] = String.join(" ", " *** ", " *** ", " ***** ", " ***** ");
        lines[1] = String.join(" ", "*   *", "*   *", "*     ", "*     ");
        lines[2] = String.join(" ", "*   *", "*   *", "*     ", "*     ");
        lines[3] = String.join(" ", "*   *", "*   *", " *****", " *****");
        lines[4] = String.join(" ", "*   *", "*   *", "     *", "     *");
        lines[5] = String.join(" ", "*   *", "*   *", "     *", "     *");
        lines[6] = String.join(" ", " *** ", " *** ", " *****", " *****");

        // Step 3: Use enhanced for-loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}