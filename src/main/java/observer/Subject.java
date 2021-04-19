package observer;

import java.util.Vector;

/**
 * 主题 或者叫被观察者
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public abstract class Subject {

  private Vector<ObServer> vector = new Vector<ObServer>();

  boolean addObServer(ObServer obServer) {
    return vector.add(obServer);
  }

  boolean deleteObServer(ObServer obServer) {
    return vector.remove(obServer);
  }

  void notifyObServer(){
    for (ObServer obServer : vector) {
      obServer.update();
    }
  }

  abstract void doSomething();
}
