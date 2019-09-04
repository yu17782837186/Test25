package cn.com.thread;

public class TestYield {
    public static void main(String[] args) {
//        Yield y1 = new Yield();
//        Yield y2 = new Yield();
//        new Thread(y1,"小红").start();
//        new Thread(y2,"小明").start();
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("lambda...."+i);
            }
        }).start();
        for (int i = 0; i < 100; i++) {
            if (i %20 == 0) {
                Thread.yield();
            }
            System.out.println("main...."+i);
        }
    }
}
//class Yield implements Runnable {
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName()+"-->start");
//        Thread.yield();
////        try {
////            Thread.sleep(1000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        System.out.println(Thread.currentThread().getName()+"-->end");
//    }
//}