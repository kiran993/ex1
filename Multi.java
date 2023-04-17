import javax.swing.plaf.multi.MultiLabelUI;

public class Multi {

public static void main(String[] args) {
    


    public synchronized void method1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Method 1 is executing...");
            try {
                Thread.sleep(5000); // wait for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void method2() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Method 2 is executing...");
            try {
                Thread.sleep(3000); // wait for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Multi example = new Multi();

        // create the first thread for method1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                example.method1();
            }
        });

       
