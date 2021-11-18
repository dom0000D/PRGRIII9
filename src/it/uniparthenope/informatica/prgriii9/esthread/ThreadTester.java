package it.uniparthenope.informatica.prgriii9.esthread;

public class ThreadTester {
    public static void main(String args[]){
        HelloRunner r = new HelloRunner();
        Thread t = new Thread(r);
        t.start();
    }
}
class HelloRunner implements Runnable{
    @Override
    public void run(){
        int i=0;
        while (true){
            System.out.println("Hello " + i++);
            if (i==50){
                break;
            }
        }
    }
}
