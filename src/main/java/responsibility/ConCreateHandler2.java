package responsibility;

/**
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class ConCreateHandler2 extends handler{

  public ConCreateHandler2(Integer level) {
    super(level);
  }

  @Override
  public void handler(Request request) {
    System.out.println("处理器2处理.。。。");
  }
}
