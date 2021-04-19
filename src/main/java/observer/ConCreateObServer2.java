package observer;

/**
 * 观察者2号
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class ConCreateObServer2 implements ObServer{

  @Override
  public void update() {
    System.out.println("观察者2收到信息，并进行处理");
  }
}
