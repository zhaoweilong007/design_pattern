package adapter;

/**
 *
 * 适配器
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class Adapter implements Target{

  private Adaptee adaptee;

  public Adapter(Adaptee adaptee){this.adaptee=adaptee;}

  @Override
  public void request() {
    System.out.println("适配前的操作....");
    adaptee.specificRequest();
    System.out.println("适配后的操作.....");
  }
}
