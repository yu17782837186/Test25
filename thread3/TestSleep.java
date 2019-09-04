package cn.com.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep {
    public static void main(String[] args) {
//        int num = 10;
//        while(true) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(num--);
//        }
        //倒计时
//        Date endTime = new Date(System.currentTimeMillis()+1000*10);
//        long end = endTime.getTime();
//        while(true) {
//            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            endTime = new Date(endTime.getTime()-1000);
//            if (end - 10000 > endTime.getTime()) {
//                break;
//            }
//        }
        Date endTime = new Date(System.currentTimeMillis()+1000*10);
        long end = endTime.getTime();
        while(true) {
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            endTime = new Date(endTime.getTime()-1000);
            if (end -10000 > endTime.getTime()) {
                break;
            }
        }
    }
}
