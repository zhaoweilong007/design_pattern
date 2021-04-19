package fatory;

/**
 * 具体产品
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class WinMouse implements Mouse{

  @Override
  public void click() {
    System.out.println("win专用鼠标");
  }
}
