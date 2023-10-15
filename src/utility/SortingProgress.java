package utility;

public class SortingProgress {

    private static final String MESSAGE = "\rПрогресс сортировки: %d%%";

    private int progress;
    private final int total;

    public SortingProgress(int total) {
        this.progress = 1;
        this.total = total;
    }

    public void printProgressMessage() {
        System.out.printf(MESSAGE, progress++ * 100 / total);
    }

    public void clearOutput() {
        System.out.print("\r" + " ".repeat(MESSAGE.length()) + "\r");
    }
}
