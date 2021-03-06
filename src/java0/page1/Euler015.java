package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler015 extends Project {

    public int number() {
        return 15;
    }

    public String call() {
        // 40!/(20! * 20!) -> (21 * 22 * ... * 40) / (1 * 2 * ... * 20)
        // Assuming this, we can devise the following:
        long num = 1;
        for (int i = 1; i <= 20; i++) {
            num *= (i + 20);
            num /= i;
        }
        return String.valueOf(num);
    }
}