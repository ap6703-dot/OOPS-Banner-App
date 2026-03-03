/*
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 * This use case extends UC4 by defining and populating the String array
 * in a single statement using String.join() method.
 */

public class UC5 {

    public static void main(String[] args) {

        // Declare and initialize banner lines inline using String.join()
        String[] lines = {
            String.join(" ", " *** ", " *** ", " ***** ", " ***** "),
            String.join(" ", "*   *", "*   *", "*     ", "*     "),
            String.join(" ", "*   *", "*   *", "*     ", "*     "),
            String.join(" ", "*   *", "*   *", " *****", " *****"),
            String.join(" ", "*   *", "*   *", "     *", "     *"),
            String.join(" ", "*   *", "*   *", "     *", "     *"),
            String.join(" ", " *** ", " *** ", " *****", " *****")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}