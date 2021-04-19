package observer;

/**
 *
 * 具体的被观察者
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class ConCreateSubject extends Subject{

  @Override
  void doSomething() {
    System.out.println("观察者时间发生改变");
    super.notifyObServer();
  }
}
