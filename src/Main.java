/**
 * Main class for connect everything together.
 * Create TaskTimer and measure the time
 * that each task uses to do its task.
 *
 * @author Pornpavee Seri-umnuoy
 */
public class Main {

    public static void main(String[] args) {
        TaskTimer timer = new TaskTimer();


        TaskString task1 = new TaskString();
        TaskStringBuilder task2 = new TaskStringBuilder();
        TaskBufferedReader task3 = new TaskBufferedReader();

        timer.timer(task1);
        timer.timer(task2);
        timer.timer(task3);
    }
}
