package test;

/**
 * 适配器模式
 *
 * @author ZhaoWeiLong
 * @date 2021/1/11
 */
public class AdapterTest {

  interface Target {
    /** 客户端请求处理的方法 */
    void request();
  }

  class Adaptee {
    /** 具体存在的方法 */
    public void specificRequest() {
      // 业务代码
      System.out.println("被适配者中方法");
    }
  }

  /** 适配器 */
  class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
      this.adaptee = adaptee;
    }

    @Override
    public void request() {
      System.out.println("适配前的操作");
      adaptee.specificRequest();
      System.out.println("适配后的操作");
    }
  }

  class Adapter2 extends Adaptee implements Target {

    @Override
    public void request() {
      System.out.println("适配前操作");
      super.specificRequest();
      System.out.println("适配后操作");
    }
  }

  {
    // 创建被适配者和适配器
    Adaptee adaptee = new Adaptee();
    Adapter adapter = new Adapter(adaptee);
    adapter.request();

    // 直接使用适配器
    Adapter2 adapter2 = new Adapter2();
    adapter2.request();
  }

  public static void main(String[] args) {
    new AdapterTest();
  }
}
