package adapter;

/**
 * 适配者
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class Adaptee {
  public void specificRequest() {
    // 业务代码
    System.out.println("被适配者中方法");
  }
}
