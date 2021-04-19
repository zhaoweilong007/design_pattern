package adapter;

/**
 * 适配器模式
 *
 * @author ZhaoWeiLong
 * @date 2021/1/11
 */
public class AdapterDemo {
  public static void main(String[] args) {
    Adaptee adaptee = new Adaptee();
    Adapter adapter = new Adapter(adaptee);
    adapter.request();
    System.out.println("==================");
    // 直接使用适配器
    Adapter2 adapter2 = new Adapter2();
    adapter2.request();
  }
}
