package proxy;

/**
 * 实现类
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class RealInternet implements Internet{

  @Override
  public void connectTO(String serverHost) throws Exception {
    System.out.println("connect To :" + serverHost);
  }
}
