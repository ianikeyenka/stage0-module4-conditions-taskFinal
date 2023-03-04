package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (y > 0) {
            if (x > 0) {
                System.out.println("first");
            } else if (x < 0) {
                System.out.println("second");
            }
        } else if (y < 0) {
            if (x > 0) {
                System.out.println("fourth");
            } else if (x < 0) {
                System.out.println("third");
            }
        } else {
            System.out.println("zero");
        }
    }
}
