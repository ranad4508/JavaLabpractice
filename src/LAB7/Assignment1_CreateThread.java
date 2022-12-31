package LAB7;

/*Write a program to illustrate creation of threads using runnable class. (Note: start method
starts each of the newly created thread. Inside the run method there is sleep() for suspend
the thread for 500 milliseconds).
*/
public class Assignment1_CreateThread implements Runnable {

    public void run() {
        try {
            Thread.sleep(500);
            System.out.println("Created thread using runnable");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Assignment1_CreateThread tit = new Assignment1_CreateThread();
        Thread t = new Thread(tit);
        t.start();
    }
}
