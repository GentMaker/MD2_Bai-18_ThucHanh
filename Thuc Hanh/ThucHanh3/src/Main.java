public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
        while (count.getMyThread().isAlive()) {
            System.out.println("Main thread will be alive till the chird thread is a live");

            Thread.sleep(1000);
        }
            } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
            }
        System.out.println("Main thread run is over ");
        }


}