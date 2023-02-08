import java.util.Objects;

public class NumberGenerator implements Runnable {
    public String generator;

    public NumberGenerator() {
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(500);
                System.out.println("running thread name is:"
                        + Thread.currentThread().getName());
                System.out.println("running thread priority is:"
                        + Thread.currentThread().getPriority());
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberGenerator that = (NumberGenerator) o;
        return Objects.equals(generator, that.generator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generator);
    }
}