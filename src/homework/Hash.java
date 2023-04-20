package homework;

public class Hash extends Thread{
    Hash(String name){
        super(name);
    }
    public void run() {
        System.out.println(getName()+" starts");
        try {

            for (int counter = 0; counter < 100; counter++) {
                System.out.print("#");
                Thread.sleep(300);
                // System.out.println("in thread " + getName()+ " counter is " + counter);
            }
        }catch (InterruptedException e){
            System.out.println(getName()+" interrupted");
        }
        System.out.println("end of "+getName());
    }
}
