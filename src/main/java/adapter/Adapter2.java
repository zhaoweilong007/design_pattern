package adapter;

/**
 * 既是适配器又是适配者
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class Adapter2 extends Adaptee implements Target{

  @Override
  public void request() {
    System.out.println("适配前操作.....");
    super.specificRequest();
    System.out.println("适配后操作......");
  }
}
