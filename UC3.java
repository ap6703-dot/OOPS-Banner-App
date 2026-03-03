/*
 * OOPSBannerApp UC3 – Render OOPS as Banner using String.join()
 * This use case replaces string concatenation (+) with String.join()
 * for better memory efficiency and cleaner code.
 */

public class UC3 {

    public static void main(String[] args) {

        // Construct each banner line using String.join()
        System.out.println(String.join(" ", " *** ", " *** ", " ***** ", " ***** "));
        System.out.println(String.join(" ", "*   *", "*   *", "*     ", "*     "));
        System.out.println(String.join(" ", "*   *", "*   *", "*     ", "*     "));
        System.out.println(String.join(" ", "*   *", "*   *", " *****", " *****"));
        System.out.println(String.join(" ", "*   *", "*   *", "     *", "     *"));
        System.out.println(String.join(" ", "*   *", "*   *", "     *", "     *"));
        System.out.println(String.join(" ", " *** ", " *** ", " *****", " *****"));
    }
}