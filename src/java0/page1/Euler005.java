package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler005 extends Project {

    public int number() {
        return 5;
    }

    public String call() {
        top:
        for (int i = 20; ; i++) {
            for (int j = 2; j <= 20; j++) {
                if (i % j != 0) {
                    continue top;
                }
            }
            return String.valueOf(i);
        }
    }
}