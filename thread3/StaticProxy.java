package cn.com.thread;

public class StaticProxy {
    public static void main(String[] args) {
        new Persion2(new Persion1()).SellThings();
    }
}
interface Stor {
    void SellThings();
}
class Persion1 implements Stor {
    @Override
    public void SellThings() {
        System.out.println("买很多东西");
    }
}
class Persion2 implements Stor {
    private Persion1 target;

    public Persion2(Persion1 target) {
        this.target = target;
    }

    @Override
    public void SellThings() {
        ready();
        this.target.SellThings();
        after();
    }
    private void ready() {
        System.out.println("买苹果和橘子");
    }
    private void after() {
        System.out.println("正在赶来的途中");
    }
}
