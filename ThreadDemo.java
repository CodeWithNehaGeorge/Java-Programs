class Display {
    synchronized void show(int i) {
        try {
            System.out.println(i);
            Thread.sleep(1500);
            System.out.println(i);
        } catch (InterruptedException e) {
            System.out.println("Caught Exception");
        }
    }
}

class T implements Runnable {
    Display d = new Display();

    T() {
        Thread t1 = new Thread(this);
        t1.setName("odd");
        Thread t2 = new Thread(this);
        t2.setName("even");
        t1.start();
        t2.start();
    }

    public void run() {
        if (Thread.currentThread().getName().equals("odd")) {
            for (int i = 1; i < 20; i = i + 2) {
                this.d.show(i);
            }
        } else {
            for (int i = 0; i < 20; i = i + 2) {
                this.d.show(i);
            }
        }
    }
}

class ThreadDemo {
    public static void main(String args[]) {
        T obj = new T();
    }
}