package page1;

import java.util.HashSet;

/**
 * page1
 * Created: 1/22/14 11:26 AM
 *
 * @author Obicere
 * @version 1.0
 */
public class Euler029 {

    private static final int LIMIT = 100;

    public static void main(final String[] args) {
        final HashSet<Double> seen = new HashSet<>();
        for (int a = 2; a <= LIMIT; a++) {
            for (int b = 2; b <= LIMIT; b++) {
                seen.add(Math.pow(a, b));
            }
        }
        System.out.println(seen.size());
    }
}