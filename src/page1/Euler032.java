package page1;

import euler.Common;

import java.util.HashSet;

/**
 * @author Obicere
 */
public class Euler032 {

    public static void main(final String[] args) {
        final HashSet<Integer> products = new HashSet<>();
        // Only possible digit-combinations
        // to produce a 9-digit number are
        // 1-digit * 4-digit
        // 2-digit * 3-digit
        for (int i = 4; i <= 98; i++) { // Can skip 99 easily and < 4 easily
            final int start = (i > 9) ? 123 : 1234; // Differentiate between 3 and 4 digits\
            for (int j = start; j <= 10000 / i; j++) {
                final int product = i * j;
                final int[] compiled = Common.combine(Common.getDigits(product), Common.getDigits(i), Common.getDigits(j));
                if (compiled.length == 9 && Common.isPandigital(compiled, 9)) {
                    products.add(product);
                }
            }
        }

        int sum = 0;
        for (final int product : products) {
            sum += product;
        }
        System.out.println(sum);
    }

}