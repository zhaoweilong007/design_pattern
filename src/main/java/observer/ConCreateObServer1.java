package observer;

/**
 * 观察者1号
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class ConCreateObServer1 implements ObServer{

  @Override
  public void update() {
    System.out.println("观察者1收到信息,并进行处理");
  }
}
