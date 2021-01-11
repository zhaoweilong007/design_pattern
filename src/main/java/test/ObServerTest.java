package test;

import java.util.Vector;

/**
 * 观察者模式
 *
 * @author ZhaoWeiLong
 * @date 2021/1/11
 */
public class ObServerTest {

  // 观察者
  interface ObServer {
    void update();
  }

  // 被观察者
  public abstract class Subject {

    private Vector<ObServer> obs = new Vector<>();

    public void addObServer(ObServer obServer) {
      obs.add(obServer);
    }

    public void deleteObServer(ObServer obServer) {
      obs.remove(obServer);
    }

    public void notifyObServer() {
      for (ObServer ob : obs) {
        ob.update();
      }
    }

    public abstract void doSomething();
  }

  // 具体的被观察者
  class ConCreateSubject extends Subject {

    @Override
    public void doSomething() {
      System.out.println("被观察者时间发生改变");
      this.notifyObServer();
    }
  }

  class ConCreateObserver1 implements ObServer {

    @Override
    public void update() {
      System.out.println("观察者1收到信息，并进行处理");
    }
  }

  class ConCreateObserver2 implements ObServer {

    @Override
    public void update() {
      System.out.println("观察者2收到信息，并进行处理");
    }
  }

  {
    ConCreateSubject subject = new ConCreateSubject();
    ConCreateObserver1 observer1 = new ConCreateObserver1();
    ConCreateObserver2 observer2 = new ConCreateObserver2();

    subject.addObServer(observer1);
    subject.addObServer(observer2);

    subject.doSomething();

    //spring的事件驱动模型就是经典的观察者模式
  }

  public static void main(String[] args) {
    new ObServerTest();
  }
}
