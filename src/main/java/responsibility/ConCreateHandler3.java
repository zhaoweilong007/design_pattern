package responsibility;

/**
 * @author ZhaoWeiLong
 * @date 2021/4/19
 */
public class ConCreateHandler3 extends handler {

  public ConCreateHandler3(Integer level) {
    super(level);
  }

  @Override
  public void handler(Request request) {
    System.out.println("处理器3处理.。。。");
  }
}
