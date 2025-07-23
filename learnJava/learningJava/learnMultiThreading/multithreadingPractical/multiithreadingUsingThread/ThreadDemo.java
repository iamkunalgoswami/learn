class Hi {
    public void display() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Say Hi.......!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.err.println(e.getStackTrace());
            }
        }
    }
}

class Hello {
    public void display() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Say Hello.......!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.err.println(e.getStackTrace());
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new Hi().display();
        new Hello().display();
    }
}