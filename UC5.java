/*
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 * This use case extends UC4 by defining and populating the String array
 * in a single statement using String.join() method.
 */

public class OOPSBannerApp {

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

        // Enhanced for-loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}