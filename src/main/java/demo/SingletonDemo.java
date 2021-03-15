package demo;

/**
 * 单例模式 DCL双重检验锁
 *
 * @author ZhaoWeiLong
 * @date 2021/1/8
 */
public class SingletonDemo {

  public static class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance() {
      if (singleton == null) {
        synchronized (Singleton.class) {
          if (singleton == null) {
            singleton = new Singleton();
          }
        }
      }
      return singleton;
    }
  }

  public static void main(String[] args) {
    Singleton instance = Singleton.getInstance();
    Singleton instance1 = Singleton.getInstance();

    System.out.println(instance == instance1);
  }
}
