package observer;

/**
 * 观察者模式
 *
 * @author ZhaoWeiLong
 * @date 2021/1/11
 */
public class ObServerDemo {

  public static void main(String[] args) {
    ConCreateSubject subject = new ConCreateSubject();
    ConCreateObServer1 observer1 = new ConCreateObServer1();
    ConCreateObServer2 observer2 = new ConCreateObServer2();

    subject.addObServer(observer1);
    subject.addObServer(observer2);

    subject.doSomething();
  }
}
